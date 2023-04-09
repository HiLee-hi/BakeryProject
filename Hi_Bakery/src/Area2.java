
public class Area2 extends SaleShelf {
	// field
	
	// constructor
	public Area2(String name, int number) {
		super(name, number);
	}
	
	// method
	public void getPlace(View view) {
		System.out.println("\t\t<빵 진열대가 생성되었습니다.>");
		view.createArea2();
	}

	public void getProduct(View view, Product b[]) {
		System.out.println("\n\t\t<빵 진열대>");
		view.area2View(b);
	}
	
	public void getProduct2(View view, Product p[]) {
		System.out.println("\n\t\t<빵 진열대>");
		view.area2View2(p);
	}
}
