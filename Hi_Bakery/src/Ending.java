
public class Ending {
	// field	
	String name;
	
	// constructor
	public Ending() {}
	
	// method
	public void setName(String name) {
		this.name = name;
	}
	public void failEnding(View view, int minimumWage, Part_timer hi) {
		view.failView();
		System.out.println("\t\t당신의 시급이 최저시급 " + minimumWage + "원 이하로 내려가 게임이 종료됩니다...");
		System.out.println("\t\t" + name + " bakery 사장님으로부터의 메세지가 도착했습니다.");
		System.out.println("\t\t🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨 To. " + hi.name + " 🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨\n");
		System.out.println("\t\t그동안 우리 가게에서 일을 해주어 고맙네...");
		System.out.println("\t\t자네가 일하는 것을 지켜본 결과 더는 함께 하지 못할 듯 싶어...");
		System.out.println("\t\t하지만 내가 많은 것을 바란 건 아니지 않은가... ");
		System.out.println("\t\t최저시급 이상을 챙겨주고 싶은 나의 마음도 헤아려주게...");
		System.out.println("\t\t\t\t\t\t\t - " + name + " bakery 사장 - \n");
		System.out.println("\t\t🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨\n");
		
		
	}
	
	public void successEnding(View view, int targetWage, Part_timer hi) {
		view.successView();
		System.out.println("\t\t당신의 시급이 목표시급 " + targetWage + "원 이상을 달성하여 성공했습니당!");
		System.out.println("\t\t" + name + " bakery 사장님으로부터의 메세지가 도착했습니다.");
		System.out.println("\t\t🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨 To. " + hi.name + " 🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨\n");
		System.out.println("\t\t" + hi.name + " 덕분에 가게가 잘 운영되고 있다네!");
		System.out.println("\t\t자네에게 주는 돈이 아깝지 않을 정도로 열심히 일해주어 고마워.");
		System.out.println("\t\t앞으로도 " + name + " bakery를 위해 일해주었으면 하네.");
		System.out.println("\t\t자네는 내가 만나본 최고의 알바생이야!");
		System.out.println("\t\t\t\t\t\t\t - " + name + " bakery 사장 - \n");
		System.out.println("\t\t🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨🥨\n");
	}
}
