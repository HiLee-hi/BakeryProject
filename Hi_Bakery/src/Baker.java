
public class Baker extends Unit {
	// field
	
	// constructor
	public Baker (String name) {
		super(name);
	}
	
	// method
	// 통합된 제품 생산 
	public void bakingProduct(Part_timer hi, Product product[]) {
		Product[] p = new Product[product.length];
		p = hi.productList(p);
		int cnt = 0;
		System.out.println("\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞");
		System.out.println( "\n\t\t<제빵사가 날짜를 확인하고 제품을 생산합니다.>\n" );
		
		for(int i = 0; i < product.length; i++) {
			if(product[i].day == 0) {
				cnt++;
				product[i] = p[i];
				System.out.println( "\t\t" + name + "가 " + product[i].name + "을(를) " + product[i].count + "개 생산했습니다. " );
			}
		}
		if(cnt == 0) System.out.println("\t\t생산이 필요한 제품이 없습니다.");
		System.out.println("\n\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞");
	}
	
	public void confirmRequest(String p_name, Part_timer hi, Product product[]) {
		Product[] p = new Product[product.length];
		p = hi.productList(p);
		
		for(int i = 0; i < product.length; i++) {
			if(p_name.equals(product[i].name)) { // == 와 equals의 차이 
				if(product[i].count == 0) {
					product[i] = p[i];
					hi.houlyWage += 50;
					System.out.println("\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞\n");
					System.out.println("\t\t" + name + "가 " + p_name + " 제품의 재고가 0인 것을 확인했습니다. ");
					System.out.println("\t\t" + name + "가 " + product[i].name + "을(를) " + product[i].count + "개 생산했습니다. \n" );
					System.out.println("\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞\n\n");
					
					break;
				}
				else {
					hi.houlyWage -= 50;
					System.out.println("\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞\n");
					System.out.println("\t\t" + name + "가 " + p_name + " 제품이 " + product[i].count + "개 남은 것을 확인했습니다. \n");
					System.out.println("\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞\n\n");

					break;
				}
			}
		}
	}
	
	// 세분화된 제품 생산 
	/*
	public void bakingBread(Part_timer hi, Product b[]) {
		Product[] product = new Product[b.length];
		product = hi.breadList(product);
		int cnt = 0;
		
		System.out.println("\n\t\t<제빵사가 빵의 재고를 확인하여 품절된 제품을 생산합니다.>");
		
		for(int i = 0; i < b.length; i++) {
			if(b[i].count == 0) {
				cnt++;
				b[i] = product[i];
				System.out.println( "\t\t" + name + "가 " + b[i].name+ "을 " + b[i].count + "개 생산했습니다. ");
			}
		}
		if(cnt == 0) System.out.println("\t\t품절된 제품이 없어 아무것도 생산하지 않았습니다.");
	}
	public void bakingCake(Part_timer hi, Product c[]) {
		Product[] product = new Product[c.length];
		product = hi.cakeList(product);
		int cnt = 0;
		
		System.out.println("\n\t\t<제빵사가 케이크의 재고를 확인하여 품절된 제품을 생산합니다.>");
		
		for(int i = 0; i < c.length; i++) {
			if(c[i].count == 0) {
				cnt++;
				c[i] = product[i];
				System.out.println( "\t\t" + name + "가 " + c[i].name+ "을 " + c[i].count + "개 생산했습니다. ");
			}
		}
		if(cnt == 0) System.out.println("\t\t품절된 제품이 없어 아무것도 생산하지 않았습니다.");
	}
	public void bakingWhiteRoll(Part_timer hi, Product w[]) {
		Product[] product = new Product[w.length];
		product = hi.whiteRollList(product);
		int cnt = 0;
		
		System.out.println("\n\t\t<제빵사가 식빵과 롤케이크의 재고를 확인하여 품절된 제품을 생산합니다.>");
		
		for(int i = 0; i < w.length; i++) {
			if(w[i].count == 0) {
				cnt++;
				w[i] = product[i];
				System.out.println( "\t\t" + name + "가 " + w[i].name+ "을 " + w[i].count + "개 생산했습니다. ");
			}
		}
		if(cnt == 0) System.out.println("\t\t품절된 제품이 없어 아무것도 생산하지 않았습니다.");
	}
	public void bakingSandwichSalad(Part_timer hi, Product s[]) {
		Product[] product = new Product[s.length];
		product = hi.sandwichSaladList(s);
		int cnt = 0;
		
		System.out.println("\n\t\t<제빵사가 샌드위치와 샐러드의 재고를 확인하여 품절된 제품을 생산합니다.>");
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].count == 0) {
				cnt++;
				s[i] = product[i];
				System.out.println( "\t\t" + name + "가 " + s[i].name+ "을 " + s[i].count + "개 생산했습니다. ");
			}
		}
		if(cnt == 0) System.out.println("\t\t품절된 제품이 없어 아무것도 생산하지 않았습니다.");
	}
	*/
}
