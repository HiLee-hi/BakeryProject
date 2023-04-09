
public class ServiceThread extends Thread {
	
	Boolean inputCheck = false;
	Boolean answerCheck = false;
	// method
	@Override
	public void run() {
		
		for(int i = 0; i < 30; i++) {
			if(inputCheck == true) {
				break;
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		// 예외처리 다시 -> 이후에 정답을 입력하면 맞는걸로 나옴 
		if(inputCheck == false) {
			System.out.println("\t\t<입력시간이 초과되었습니다. 아무 숫자를 입력해주세요.> ");
			answerCheck = true;
		}
	}
	
	public int answerChange() {
		if(answerCheck == true) return 0;
		else return 1;
	}
}
