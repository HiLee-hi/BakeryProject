
public class Part_timer extends Unit {
	// field 
	int houlyWage;
	
	// constructor
	public Part_timer (String name) {
		super(name);
		houlyWage = 9160;
	}
	
	// method
	public int getWage() {
		System.out.println("\t\t🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰\n");
		System.out.println("\t\t\t\t\t    <현재 시급>");
		System.out.println("\t\t\t\t " + name + "의 현재 시급은 " + houlyWage + "원 입니다.\n");
		System.out.println("\t\t🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰\n\n");
		return houlyWage;
	}
	public void finalWage() {
		System.out.println("\t\t🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰\n");
		System.out.println("\t\t\t\t\t    <최종 시급>");
		System.out.println("\t\t\t\t " + name + "의 최종 시급은 " + houlyWage + "원 입니다.\n");
		System.out.println("\t\t🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰\n\n");
	}
	
	public void calculate(Product p[]) {
		System.out.println("\t\t계산합니다.");
		int cnt = 0, sum = 0; 
		System.out.println("\t\t구\t매\t품\t목");
		System.out.println("\t--------------------------------");
		System.out.println("\t\t제품명\t가격\t개수");
		for(int i = 0; i < p.length; i++) {
			System.out.println("\t" + (i+1) + ".\t" + p[i].name + "\t" + p[i].price + "\t" + p[i].count);
			cnt += p[i].count;
			sum += p[i].price * p[i].count;
		}
		System.out.println("\t--------------------------------");
		System.out.println("\t\t합계\t" + sum + "\t" + cnt);
	}

	// 통합된 제품 등록 
	public void displayProduct(Product p[]) {
		p[0] = new Product("우유듬뿍생크림케이크1", 27000, 2, 0, 3);
		p[1] = new Product("우유가득생크림케이크1", 29000, 2, 0, 3);
		p[2] = new Product("클래식쇼콜라1", 24000, 2, 0, 3);
		p[3] = new Product("우유가득생크림케이크2", 31000, 2, 0, 3);
		p[4] = new Product("클래식밀크초코2", 29000, 2, 0, 3);
		p[5] = new Product("우유듬뿍생크림케이크3", 34000, 2, 0, 3);
		p[6] = new Product("쇼콜라파티3", 31000, 2, 0, 3);
		p[7] = new Product("소보루빵", 1500, 4, 1, 2);
		p[8] = new Product("바게뜨", 3700, 4, 1, 2);
		p[9] = new Product("고로케", 2700, 4, 1, 2);
		p[10] = new Product("꽈배기", 1900, 4, 1, 2);
		p[11] = new Product("단팥빵", 1500, 4, 1, 2);
		p[12] = new Product("피자빵", 3000, 4, 1, 2);
		p[13] = new Product("맘모스빵", 5100, 4, 1, 2);
		p[14] = new Product("찹쌀도넛", 1900, 4, 1, 2);
		p[15] = new Product("카스테라", 1900, 4, 1, 2);
		p[16] = new Product("크림빵", 2100, 4, 1, 2);
		p[17] = new Product("후레쉬번", 3800, 4, 1, 2);
		p[18] = new Product("쿠키", 1100, 4, 1, 2);
		p[19] = new Product("머핀", 3100, 4, 1, 2);
		p[20] = new Product("치즈케익", 1800, 4, 1, 2);
		p[21] = new Product("마들렌", 1500, 4, 1, 2);
		p[22] = new Product("초코소라빵", 1500, 4, 1, 2);
		p[23] = new Product("옥수수식빵", 4000, 4, 2, 3);
		p[24] = new Product("우유식빵", 3300, 4, 2, 3);
		p[25] = new Product("밤식빵", 6400, 4, 2, 3);
		p[26] = new Product("통밀식빵", 4700, 4, 2, 3);
		p[27] = new Product("딸기듬뿍롤케이크", 13000, 2, 2, 5);
		p[28] = new Product("실키롤케이크", 13000, 2, 2, 5);
		p[29] = new Product("블루베리듬뿍롤케이크", 13000, 2, 2, 5);
		p[30] = new Product("카페모카롤", 13000, 2, 2, 5);
		p[31] = new Product("샐러드빵", 3800, 4, 3, 2);
		p[32] = new Product("호밀빵샌드위치", 6300, 4, 3, 2);
		p[33] = new Product("런치샌드위치", 6800, 4, 3, 2);
		p[34] = new Product("디럭스샌드위치", 6200, 4, 3, 2);
		p[35] = new Product("로스트치킨샐러드", 6800, 2, 3, 2);
		p[36] = new Product("케이준치킨샐러드", 7000, 2, 3, 2);

	}
	
	// 제품 리스트 
	// 통합된 제품 리스트 
	public Product[] productList(Product p[]) {
		p[0] = new Product("우유듬뿍생크림케이크1", 27000, 2, 0, 3);
		p[1] = new Product("우유가득생크림케이크1", 29000, 2, 0, 3);
		p[2] = new Product("클래식쇼콜라1", 24000, 2, 0, 3);
		p[3] = new Product("우유가득생크림케이크2", 31000, 2, 0, 3);
		p[4] = new Product("클래식밀크초코2", 29000, 2, 0, 3);
		p[5] = new Product("우유듬뿍생크림케이크3", 34000, 2, 0, 3);
		p[6] = new Product("쇼콜라파티3", 31000, 2, 0, 3);
		p[7] = new Product("소보루빵", 1500, 4, 1, 2);
		p[8] = new Product("바게뜨", 3700, 4, 1, 2);
		p[9] = new Product("고로케", 2700, 4, 1, 2);
		p[10] = new Product("꽈배기", 1900, 4, 1, 2);
		p[11] = new Product("단팥빵", 1500, 4, 1, 2);
		p[12] = new Product("피자빵", 3000, 4, 1, 2);
		p[13] = new Product("맘모스빵", 5100, 4, 1, 2);
		p[14] = new Product("찹쌀도넛", 1900, 4, 1, 2);
		p[15] = new Product("카스테라", 1900, 4, 1, 2);
		p[16] = new Product("크림빵", 2100, 4, 1, 2);
		p[17] = new Product("후레쉬번", 3800, 4, 1, 2);
		p[18] = new Product("쿠키", 1100, 4, 1, 2);
		p[19] = new Product("머핀", 3100, 4, 1, 2);
		p[20] = new Product("치즈케익", 1800, 4, 1, 2);
		p[21] = new Product("마들렌", 1500, 4, 1, 2);
		p[22] = new Product("초코소라빵", 1500, 4, 1, 2);
		p[23] = new Product("옥수수식빵", 4000, 4, 2, 3);
		p[24] = new Product("우유식빵", 3300, 4, 2, 3);
		p[25] = new Product("밤식빵", 6400, 4, 2, 3);
		p[26] = new Product("통밀식빵", 4700, 4, 2, 3);
		p[27] = new Product("딸기듬뿍롤케이크", 13000, 2, 2, 5);
		p[28] = new Product("실키롤케이크", 13000, 2, 2, 5);
		p[29] = new Product("블루베리듬뿍롤케이크", 13000, 2, 2, 5);
		p[30] = new Product("카페모카롤", 13000, 2, 2, 5);
		p[31] = new Product("샐러드빵", 3800, 4, 3, 2);
		p[32] = new Product("호밀빵샌드위치", 6300, 4, 3, 2);
		p[33] = new Product("런치샌드위치", 6800, 4, 3, 2);
		p[34] = new Product("디럭스샌드위치", 6200, 4, 3, 2);
		p[35] = new Product("로스트치킨샐러드", 6800, 2, 3, 2);
		p[36] = new Product("케이준치킨샐러드", 7000, 2, 3, 2);
		
		return p;
	}
}
