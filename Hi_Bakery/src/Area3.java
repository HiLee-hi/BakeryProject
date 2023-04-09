
public class Area3 extends SaleShelf {
	// field
	
	// constructor
	public Area3(String name, int number) {
		super(name, number);
	}
	
	// method
	public void getPlace(View view) {
		System.out.println("\t\t<식빵 & 롤케이크 진열대가 생성되었습니다.>");
		view.createArea3();
	}
	
	public void getProduct(View view, Product w[]) {
		System.out.println("\n\t\t<식빵 & 롤케이크 진열대>");
		view.area3View(w);
	}
	public void getProduct2(View view, Product p[]) {
		System.out.println("\n\t\t<식빵 & 롤케이크 진열대>");
		view.area3View2(p);
	}
}
