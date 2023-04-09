
public class DayThread extends Thread {
	int day = 1;
	int dailyTotal = 0; // 하루 총 매출액을 위한 변수 
	int min;
	Boolean check = false;
	// method
	@Override
	public void run() {
		int n = 0;
		while(true) {	
			n++;
			min = n / 60 % 60;
			
			if(check == true) {
				System.out.println("\t\t🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰\n");
				System.out.println("\t\t\t\t<" + day + "일 차의 총 매출액은 " + dailyTotal + "원 입니다.>\n");
				System.out.println("\t\t🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰🍰\n\n");
				dailyTotal = 0;
				day ++;
				n = 0;
				check = false;
			}
			try {
				sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}

}
