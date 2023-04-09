
public class Counter extends Place {
	
	// field
	String bakery; // 입력받은 bakery 이름 받아오기 위한 변수 

	// constructor
	public Counter(String name, int number, String bakery) {
		super(name, number);
		this.bakery = bakery;
	}
	
	// method 
	public void pickProduct(Product p[]) {
		System.out.println("\t\t🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩\n");
		System.out.println("\t\t\t\t  <손님이 선택한 제품은 다음과 같습니다.>");
		// customer가 고른 제품 항목 
		for(int i = 0; i < p.length; i++) {
			System.out.println("\t\t" + (i+1) + ". " + p[i].name + ", " + p[i].price + ", " + p[i].count);
		}
		System.out.println("\n\t\t🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩🍩");

	}
	public void productReceipt(Product p[], Customer c) {
		// customer가 고른 제품들 영수증처럼 찍어서 보여주기 
		// 선택된 제품의 개수(n)와 합계(sum)를 마지막에 표현해야 함 
		int cnt = 0, sum = 0; 
		String name;
		
		System.out.println("\n\n\t\t<성공적으로 계산하여 제품을 판매합니다.>");
		System.out.println("\t\t\t     ___________________________________");
		System.out.println("\t\t\t    |\t\tReceipt" + "\t\t\t|");
		System.out.println("\t\t\t    |\t\t\t\t\t|");
		System.out.println("\t\t\t    |  가게명: " + bakery + " bakery" + "\t\t\t|");
		System.out.println("\t\t\t    |  고객: " + c.getName() + "\t\t\t\t|");
		System.out.println("\t\t\t    |-----------------------------------|");
		System.out.println("\t\t\t    |\t제품명\t\t가격\t개수\t|");
		for(int i = 0; i < p.length; i++) {
			System.out.print("\t\t\t    |" + (i+1) + ".\t");
			System.out.print(p[i].name);
			name = p[i].name;
			if(name.length() < 6) System.out.print("\t\t");
			else System.out.print("\t");
			System.out.print(p[i].price + "\t");
			System.out.println(p[i].count + "\t|");
			cnt += p[i].count;
			sum += p[i].price * p[i].count;
		}
		System.out.println("\t\t\t    |-----------------------------------|");
		System.out.println("\t\t\t    |\t합계\t\t" + sum + "\t" + cnt + "\t|");
		System.out.println("\t\t\t     ___________________________________\n\n");
	}
	
	public int calculate(Product p[]) {
		int sum = 0; 
		
		for(int i = 0; i < p.length; i++) {
			sum += p[i].price * p[i].count;
		}
		
		return sum; // 손님이 고른 제품들의 가격을 합산하여 반환 
	}
	
	public void getPlace(View view) {

	}
}
