
public class Area1 extends SaleShelf {
	// field

	// constructor
	public Area1(String name, int number) {
		super(name, number);
	}
	
	// method
	public void getPlace(View view) {
		System.out.println("\t\t<케이크 쇼케이스가 생성되었습니다.>");
		view.createArea1();
	}
	
	public void getProduct(View view, Product c[]) {
		System.out.println("\n\t\t<케이크 쇼케이스>");
		view.area1View(c);
	}
	public void getProduct2(View view, Product p[]) {
		System.out.println("\n\t\t<케이크 쇼케이스>");
		view.area1View2(p);
	}
}
