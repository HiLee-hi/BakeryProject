
public class Area4 extends SaleShelf {
	// field

	// constructor
	public Area4(String name, int number) {
		super(name, number);
	}
	
	// method
	public void getPlace(View view) {
		System.out.println("\t\t<샌드위치 & 샐러드 냉장고가 생성되었습니다.>");
		view.createArea4();
	}
	
	public void getProduct(View view, Product s[]) {
		System.out.println("\n\t\t<샌드위치 & 샐러드 냉장고>");
		view.area4View(s);
	}
	public void getProduct2(View view, Product p[]) {
		System.out.println("\n\t\t<샌드위치 & 샐러드 냉장고>");
		view.area4View2(p);
	}
}
