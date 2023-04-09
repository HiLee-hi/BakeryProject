
class Opening {
	// field 
	String name;
	
	// constructor
	public Opening() {}
	 
	// method
	public void startGame(View view) {
		view.startView();
		
		System.out.println("\t\t 🍞🍞🍞🍞🍞🍞🍞Welcome to Bakery Tycoon:-)🍞🍞🍞🍞🍞🍞🍞\n");
		System.out.println("\t\t🍰🍰🍰🍰🍰🍰당신이 일하는 Bakery의 이름을 입력해주세요.🍰🍰🍰🍰🍰🍰");
	}
	public String setName(String name) {
		this.name = name;
		System.out.println("\n\t\t 🍰🍰🍰🍰🍰🍰🍰" + name + " Bakery에서의 알바가 시작됩니다.🍰🍰🍰🍰🍰🍰🍰\n\n\n");
		return name;
		// startGame, setName 합치는게 나을까... 
	}
	public void gameStroy() {
		System.out.println("\n");
		System.out.println("\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞");
		System.out.println("\t\t" + name + " bakery에서 일하는 나의 현재 시급은 9,160원...");
		System.out.println("\t\t맛있는거 사먹고 예쁜 옷 사입고 좋은 곳 놀러다니는게 내 행복인데...");
		System.out.println("\t\t행복하게 살고 만족하며 일하기엔 너무 작은 금액이다. ");
		System.out.println("\t\t내 목표시급은 10,000원. 열심히 일하면 사장님이 올려주신다고 약속했지.");
		System.out.println("\t\t얼른 올려보자구!");
		System.out.println("\t\t🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞🍞\n\n");
	}
	public void gameTutorial() {
		System.out.println("\t\t🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨게임 튜토리얼🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨");
		System.out.println("\t\t- 손님의 결제 금액을 정확히 계산하면 시급이 100원 올라갑니다. ");
		System.out.println("\t\t- 손님의 결제 금액을 틀릴 경우 시급이 100원 내려갑니다. ");
		System.out.println("\t\t- 결제 금액 입력에는 30초의 시간제한이 있습니다.");
		System.out.println("\t\t- 5초의 시간이 지나면 시급이 100원 내려갑니다.");
		System.out.println("\t\t- 재고가 0인 제품은 생산이 필요합니다.");
		System.out.println("\t\t- 생산이 필요한 제품을 제빵사에게 알려 도움을 주면 시급이 50원 올라갑니다.");
		System.out.println("\t\t- 재고가 있는 제품을 알려줄 경우 시급이 50원 내려갑니다. ");
		System.out.println("\t\t- 최저시급보다 아래로 내려가게 되면 게임이 종료됩니다. ");
		System.out.println("\t\t- 시급이 1만원 이상이 되면 성공!!! ");
		System.out.println("\t\t🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨\n\n");
	}
}
