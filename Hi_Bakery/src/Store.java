
// 처음 공간 배치도 

public class Store extends Place {
	// field

	// constructor
	public Store(String name, int number) {
		super(name, number);
	}

	// method
	public void getPlace(View view) {
		System.out.println("\t\t<매장이 생성되었습니다.>");
		view.storeView();
	}
}
