import java.util.Random;

public class Customer extends Unit {
	// field
	int number;
	Random random = new Random();
	
	int[] type = new int[4];
	
	// constructor
	public Customer (String name, int number) {
		super(name);
		this.number = number;
	}
	
	// method 
	public String getName() {
		name = name + number;
		return name;
	}
	
	// 제품 타입 배열 초기화 
	public void initializationType() {
		for(int i = 0; i < type.length; i++) {
			type[i] = 0;
		}
	}
	// 제품 타입 배열에 선택되는 타입 숫자 증가 
	public void selectedType(Product p[]) {
		for(int i = 0; i < p.length; i++) {
			if(p[i].type == 0) type[0]++;
			else if(p[i].type == 1) type[1]++;
			else if(p[i].type == 2) type[2]++;
			else type[3]++;
		}
	}
	
	// 선택 되는 제품 개수 줄이기 
	public Product[] randomProduct(Product product[]) {
		int n;
		int a, b;
		Product[] option;
		int cnt = 0, index = 0; // cnt = option의 크기, index는 option에 제품을 넣어주기 위한 변수 
		
		n = random.nextInt(5) + 1;
		int[][] array = new int[n][2];
		Product[] p = new Product[n];
		
		// 선택 가능한 제품 배열 만들기 
		for(int i = 0; i < product.length; i++) {
			if(product[i].count != 0 && product[i].day != 0) cnt++;
		}
		option = new Product[cnt];
		
		for(int i = 0; i < product.length; i++) {
			if(product[i].count != 0 && product[i].day != 0) {
				option[index] = product[i];
				index++;
			}
		}
		
		// 제품 선택 
		for(int i = 0; i < n; i++) {
			array[i][0] = random.nextInt(option.length);
//			for(int j = 0; j < i; j++) {
//				if(array[j][0] == array[i][0]) i--;
//			}
			a = array[i][0];
			b = option[a].count;
			array[i][1] = random.nextInt(b) + 1;
			option[a].count -= array[i][1];
		}
		
		for(int i = 0; i < n; i++) {
			p[i] = new Product(option[array[i][0]].name, option[array[i][0]].price, array[i][1], option[array[i][0]].type, option[array[i][0]].day);
		}
		
		return p;
	}
	
	public Product[] randomSelect(Product product[]) {
		int n;
		int a, b;
		
		n = random.nextInt(5) + 1; // 선택되는 제품의 개수 1~5 사이로 설정 
		
		int[][] array = new int[n][2]; // index 0에는 제품 번호, 1에는 선택할 개수 
		Product[] p = new Product[n]; // 손님이 선택한 제품 리스트 
		
		for(int i = 0; i < n; i++) {
			array[i][0] = random.nextInt(product.length); // 0~36까지의 랜덤 index 
			a = array[i][0];
			if(i == 0) { if(product[a].count == 0) { i = 0; continue; } }
			// 같은 제품이 다시 선택되지 않도록 하기 (i != 0)
			else { for(int j = 0; j < i; j++) { 
				if(array[i][0] == array[j][0]) { i--; continue; }
			}}
			if(i != 0 && product[a].count == 0) { i--; continue; } 
			b = product[a].count;
			if(b != 0) { 
				array[i][1] = random.nextInt(b) + 1; 
				product[a].count -= array[i][1];
			}
		}
		
		for(int i = 0; i < n; i++) {
			p[i] = new Product(product[array[i][0]].name, product[array[i][0]].price, array[i][1], product[array[i][0]].type, product[array[i][0]].day);
		}
		return p;
	}
	
	public void returnProduct(Product p[], Product product[]) {
		String name;
		for(int i = 0; i < p.length; i++) {
			name = p[i].name;
			for(int j = 0; j < product.length; j++) {
				if(name.equals(product[j].name)) {
					product[j].count += p[i].count;
				}
			}
		}
	}
	
/*	
	public Product[] randomOne(Product p1[]) {
		// random 사용하기, 일단 bread2로 해보자 
	
		// 1) 집단 하나의 제품 하나만 랜덤으로 선택해 넘겨주기 
//		int n = random.nextInt(16); 
//		Product p1 = new Product(b[n].name, b[n].price, 1);
//		b[n].count -= 1;
//		return p1;
		
		// 2) 하나의 집단 제품 여러개를 랜덤으로 선택해 넘겨주기 
		// 16개의 제품중에서 몇개를 선택할 지, 0~16의 범위를 위해 17 입력 
//		int n = random.nextInt(p1.length) + 1; 
		// 선택되는 제품의 개수를 랜덤이 아닌 3개로 제한해보기 
		int n = 3;
		int tmp;
		int[][] array = new int[n][2];
		// index 0에는 제품 번호, 1에는 선택할 개수 
		Product[] p = new Product[n];
		
		for(int i = 0; i < n; i++) {
			array[i][0] = random.nextInt(p1.length); // 제품의 인덱스 넣어주기 
			// 같은 제품이 다시 선택되지 않도록 하기  
			for(int j = 0; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p1[tmp].count == 0) i--;	// 해당 제품의 개수가 0이면 선택할 수 없으므로 다시 
			array[i][1] = random.nextInt(p1[tmp].count) + 1;
			p1[tmp].count -= array[i][1];
		}
		
		for(int i = 0; i < n; i++) {
			p[i] = new Product(p1[array[i][0]].name, p1[array[i][0]].price, array[i][1]);
		}
		return p;
	}
	// 3) 여러 집단 여러 제품 선택해 넘겨주기 
	public Product[] randomTwo(Product p1[], Product p2[]) {
//		int n = random.nextInt(p1.length) + 1;
//		int m = random.nextInt(p2.length) + 1;
		int n = 3, m = 1;
		int tmp;
		int[][] array = new int[n + m][2];
		    
		Product[] p = new Product[n + m];
		
		for(int i = 0; i < n; i++) {
			array[i][0] = random.nextInt(p1.length);
			for(int j = 0; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p1[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p1[tmp].count) + 1;
			p1[tmp].count -= array[i][1];
		}
		for(int i = n; i < n + m; i++) {
			array[i][0] = random.nextInt(p2.length);
			for(int j = n; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
			//if(p2[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p2[tmp].count) + 1;
			p2[tmp].count -= array[i][1];
		}
		for(int i = 0; i < n + m; i++) {
			if(i < n) { p[i] = new Product(p1[array[i][0]].name, p1[array[i][0]].price, array[i][1]); }
			else { p[i] = new Product(p2[array[i][0]].name, p2[array[i][0]].price, array[i][1]); }
		}
		return p;
	}
	
	public Product[] randomThree(Product p1[], Product p2[], Product p3[]) {
//		int n = random.nextInt(p1.length) + 1;
//		int m = random.nextInt(p2.length) + 1;
//		int l = random.nextInt(p3.length) + 1;
		int n = 2, m = 1, l = 1;
		int tmp;
		int[][] array = new int[n + m + l][2];
		
		Product[] p = new Product[n + m + l];
		
		for(int i = 0; i < n; i++) {
			array[i][0] = random.nextInt(p1.length);
			for(int j = 0; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p1[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p1[tmp].count) + 1;
			p1[tmp].count -= array[i][1];
		}
		for(int i = n; i < n + m; i++) {
			array[i][0] = random.nextInt(p2.length);
			for(int j = n; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p2[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p2[tmp].count) + 1;
			p2[tmp].count -= array[i][1];
		}
		for(int i = n + m; i < n + m + l; i++) {
			array[i][0] = random.nextInt(p3.length);
			for(int j = n + m; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p3[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p3[tmp].count) + 1;
			p3[tmp].count -= array[i][1];
		}
		for(int i = 0; i < n; i++) {
			p[i] = new Product(p1[array[i][0]].name, p1[array[i][0]].price, array[i][1]);
		}
		for(int i = n; i < n + m; i++) {
			p[i] = new Product(p2[array[i][0]].name, p2[array[i][0]].price, array[i][1]);
		}
		for(int i = n + m; i < n + m + l; i++) {
			p[i] = new Product(p3[array[i][0]].name, p3[array[i][0]].price, array[i][1]);
		}
		return p;
	}
	
	public Product[] randomFour(Product p1[], Product p2[], Product p3[], Product p4[]) {
//		int n = random.nextInt(p1.length) + 1;
//		int m = random.nextInt(p2.length) + 1;
//		int l = random.nextInt(p3.length) + 1;
//		int k = random.nextInt(p4.length) + 1;
		int n = 2, m = 1, l = 1, k = 1;
		int tmp;
		int[][] array = new int[n + m + l + k][2];
		
		Product[] p = new Product[n + m + l + k];
		
		for(int i = 0; i < n; i++) {
			array[i][0] = random.nextInt(p1.length);
			for(int j = 0; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p1[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p1[tmp].count) + 1;
//			p1[tmp].count -= array[i][1];
		}
		for(int i = n; i < n + m; i++) {
			array[i][0] = random.nextInt(p2.length);
			for(int j = n; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p2[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p2[tmp].count) + 1;
//			p2[tmp].count -= array[i][1];
		}
		for(int i = n + m; i < n + m + l; i++) {
			array[i][0] = random.nextInt(p3.length);
			for(int j = n + m; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p3[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p3[tmp].count) + 1;
//			p3[tmp].count -= array[i][1];
		}
		for(int i = n + m + l; i < n + m + l + k; i++) {
			array[i][0] = random.nextInt(p4.length);
			for(int j = n + m + l; j < i; j++) { if(array[i][0] == array[j][0]) i--; }
			tmp = array[i][0];
//			if(p4[tmp].count == 0) i--;
			array[i][1] = random.nextInt(p4[tmp].count) + 1;
//			p4[tmp].count -= array[i][1];
		}
		for(int i = 0; i < n; i++) {
			p[i] = new Product(p1[array[i][0]].name, p1[array[i][0]].price, array[i][1]);
		}
		for(int i = n; i < n + m; i++) {
			p[i] = new Product(p2[array[i][0]].name, p2[array[i][0]].price, array[i][1]);
		}
		for(int i = n + m; i < n + m + l; i++) {
			p[i] = new Product(p3[array[i][0]].name, p3[array[i][0]].price, array[i][1]);
		}
		for(int i = n  + m + l; i < n + m + l + k; i++) {
			p[i] = new Product(p4[array[i][0]].name, p4[array[i][0]].price, array[i][1]);
		}
		return p;
	}
*/
}
