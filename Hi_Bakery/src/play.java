//import java.util.Random;
import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class play {
	// BackgroundMusic
// main에서 다음 코드로 실행 가능. 	
//  audio1();
	public static void audio() {
		try {
			File file = new File("/Users/ihyein/Downloads/Mr.-Turtle-The-Green-Orbs.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
		} catch (Exception e) {
			System.err.println("Put the music.wav file in the sound folder");
		}
	}
	
	public static void main(String[] args) {
		
		// field
		String name; // 입력받는 bakery의 이름 
		int price; // 손님이 내야하는 금액 
		int answer; // 알바생이 계산한 금액, 사용자의 대답 
		
		Boolean out = true; // while문 작동, false일 때 빠져나옴 
		int turn = 0; // 손님 번호, 날짜가 지나면 다시 0으로 바뀌도록 작
		
		int minimumWage = 9160; // 최저시급 
		int targetWage = 10000; // 목표시급 
		int choice; // 손님 받기 or 재고 채우기를 선택하기 위한 변수 
		String p_name; // 재고 요청할 때 제품 이름을 입력받을 변수 
		
		// 베이커리 이름, 제품의 금액 등을 입력받을 스캐너 
		Scanner scanner = new Scanner(System.in);
		// 이미지를 보여줄 View 변수 생성 
		View view = new View();
		
		Audio1 audio1 = new Audio1();
		audio1.start();
		
		Opening opening = new Opening();
		Ending ending = new Ending();
		
		// 게임 오프닝 
		opening.startGame(view);
		name = scanner.nextLine();
		opening.setName(name);
		try { Thread.sleep(3000); } catch (Exception e) { return; }
		opening.gameStroy();
		try { Thread.sleep(3000); } catch (Exception e) { return; }
		opening.gameTutorial();
		try { Thread.sleep(3000); } catch (Exception e) { return; }
		
		// 유닛 생성 - 알바생, 기사님
		Part_timer hi = new Part_timer("알바생 hi");
		Baker baker = new Baker("제빵사 bye");
		
		// 공간 생성 
		Store store = new Store("매장 내부", 0);
		store.getPlace(view);
		// 천천히 보여주기 위해 추가 나중에 제거할 것 
		try { Thread.sleep(2000); } catch (Exception e) { return; }
		Area1 area1 = new Area1("케이크", 1);
		area1.getPlace(view);
		try { Thread.sleep(2000); } catch (Exception e) { return; }
		Area2 area2 = new Area2("빵", 2);
		area2.getPlace(view);
		try { Thread.sleep(2000); } catch (Exception e) { return; }
		Area3 area3 = new Area3("식빵&롤케이크", 3);
		area3.getPlace(view);
		try { Thread.sleep(2000); } catch (Exception e) { return; }
		Area4 area4 = new Area4("샌드위치&샐러드", 4);
		area4.getPlace(view);
		try { Thread.sleep(3000); } catch (Exception e) { return; }
		Counter counter = new Counter("카운터", 5, name);
		counter.getPlace(view);
		ManufacturingRoom manufacturingRoom = new ManufacturingRoom("제조실", 6);
		manufacturingRoom.getPlace(view);
		
		// 1-2. 제품 분류 없이 단순한 Product 배열로 변경 
		Product[] product = new Product[37];
		
		// 2-2. 세부 제품 등록의 단순화 
		hi.displayProduct(product);

		// 3-2. product 보여주기 
//		area1.getProduct2(view, product);
//		try { Thread.sleep(2000); } catch (Exception e) { return; }
//		area2.getProduct2(view,  product);
//		try { Thread.sleep(2000); } catch (Exception e) { return; }
//		area3.getProduct2(view, product);
//		try { Thread.sleep(2000); } catch (Exception e) { return; }
//		area4.getProduct2(view, product);
//		try { Thread.sleep(2000); } catch (Exception e) { return; }
	
		Customer customer; // 손님 
		Product p[]; // 손님이 선택한 제품을 받아오기 위한 제품 배열 
		
		DayThread dt = new DayThread(); // DayThread 생성 및 시작 
		dt.start();
		
		// 게임 시작 
		while(out) {
			if(dt.min == 1) {
				for(int i = 0; i < product.length; i++) {
					product[i].dayMinus();
				}
				dt.check = true;
				turn = 0;
				try { Thread.sleep(5000); } catch (Exception e) { return; }
				area1.getProduct2(view, product);
				try { Thread.sleep(1000); } catch (Exception e) { return; }
				area2.getProduct2(view, product);
				try { Thread.sleep(1000); } catch (Exception e) { return; }
				area3.getProduct2(view, product);
				try { Thread.sleep(1000); } catch (Exception e) { return; }
				area4.getProduct2(view, product);
				try { Thread.sleep(1000); } catch (Exception e) { return; }
				baker.bakingProduct(hi, product);
			}
			
			try { Thread.sleep(2000); } catch (Exception e) { return; }
			
			view.counterView1();
			choice = scanner.nextInt();
			
			if(choice == 1) { // 손님 받기를 선택한 경우 
				customer = new Customer("손님", turn);
//				p = c[turn].randomSelect(product);
//				p = customer.randomSelect(product);
				p = customer.randomProduct(product);
				try { Thread.sleep(2000); } catch (Exception e) { return; }

				counter.pickProduct(p); // 손님이 선택한 제품 리스트 출력 
				//System.out.println(counter.calculate(p)); // 금액 확인 위해 추가한 것 
				
				// 결제 금액을 입력받아 같은지 아닌지 확인하고 그에 따른 절차 진행 
				try { Thread.sleep(2000); } catch (Exception e) { return; }
				System.out.println("\n\t\t<결제 금액을 입력해주세요.>");
				
				ServiceThread st = new ServiceThread();
				st.start();
				answer = scanner.nextInt();
				st.inputCheck = true;
//				st.interrupt();
				price = counter.calculate(p); 
				
				// 입력시간 초과 후 정답을 입력해도 오답처리 
				if(st.answerChange() == 0) answer = st.answerChange();
			
				if(answer == price) {
					dt.dailyTotal += price;
					try { Thread.sleep(2000); } catch (Exception e) { return; }
//					counter.productReceipt(p, c[turn]);
					counter.productReceipt(p, customer);
					hi.houlyWage += 100;
					turn++;
				}
				else {
					try { Thread.sleep(2000); } catch (Exception e) { return; }
					if(answer == 0) {
						System.out.println("\t\t<입력시간이 초과되어 손님이 제품을 구매하지 않았습니다. 제품을 반환합니다...>");
					}
					else {
						System.out.println("\t\t<계산이 틀려 손님이 제품을 구매하지 않았습니다. 제품을 반환합니다...>");
					}
//					c[turn].returnProduct(p, product);
					customer.returnProduct(p, product);
					hi.houlyWage -= 100;
				}
				try { Thread.sleep(2000); } catch (Exception e) { return; }
				
				hi.getWage();
				try { Thread.sleep(2000); } catch (Exception e) { return; }
				
				//baker.bakingProduct(hi, product);
				//scanner.nextLine();
				
//				c[turn].initializationType();
//				c[turn].selectedType(p);
				customer.initializationType();
				customer.selectedType(p);
				
				st.interrupt();
				
			}
			else if(choice == 2) { // 재고 채우기를 선택한 경우 
				try { Thread.sleep(2000); } catch (Exception e) { return; }
				view.counterView2();
				p_name = scanner.next();
				System.out.println(p_name);
				try { Thread.sleep(2000); } catch (Exception e) { return; }
				baker.confirmRequest(p_name, hi, product);
				try { Thread.sleep(2000); } catch (Exception e) { return; }
				hi.getWage();
			}
			else if(choice == 3) {
				out = false;
			}
			else { // 잘못 입력한 경우 
				System.out.println("\t\t잘못입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(hi.houlyWage < minimumWage || hi.houlyWage >= targetWage) out = false;
			// 목표시급 늘리기 
			
			for(int i = 0; i < product.length; i++) {
				if(product[i].count == 0)
					product[i].day = 0;
			}
			
			area1.getProduct2(view, product);
			try { Thread.sleep(1000); } catch (Exception e) { return; }
			area2.getProduct2(view, product);
			try { Thread.sleep(1000); } catch (Exception e) { return; }
			area3.getProduct2(view, product);
			try { Thread.sleep(1000); } catch (Exception e) { return; }
			area4.getProduct2(view, product);
		}
		
		// 메인 음악 종료
		audio1.audio1Stop();
		
		// 엔딩 음악 시작 
		Audio2 audio2 = new Audio2();
		audio2.start();
		
		// 엔딩!!!
		hi.finalWage();
		ending.setName(name);
		if(hi.houlyWage < minimumWage) ending.failEnding(view, minimumWage, hi);
		if(hi.houlyWage >= targetWage) ending.successEnding(view, targetWage, hi);
		audio2.audio2Stop();
		
		scanner.close();
	}

}
