
public class Product {
	//field
	String name; // 이름 
	int price; // 가격 
	int count; // 개수 
	int day; // 폐기까지 남은 날짜 
	
	int type;
	
	// constructor
	public Product() {}
	public Product(String name, int price, int count, int type, int day) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.type = type;
		this.day = day;
	}
	
	// method
	public void dayMinus() {
		if(day != 0) day--;
		else day = 0;
	}
	
}
