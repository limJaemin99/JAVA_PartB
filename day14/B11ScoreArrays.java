package partB.day14;

import java.util.Scanner;

public class B11ScoreArrays {
	public static final String FONT_RED = "\u001B[31m";  
	public static final String RESET = "\u001B[0m";  
	public static final String FONT_BLUE = "\u001B[34m";   
	public static final String FONT_PURPLE = "\u001B[35m";  
	public static int len=0;	//입력할 학생 수
	public static Score[] score = new Score[len];
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		int choice;	// 선택지에서 사용
		int slen;
		boolean isCorrect=true;	//while 무한루프용
		boolean isCorrect2=true;	//while 무한루프용
		boolean isCorrect3=true;	//while 무한루프용
		String name;
		String subject;//과목
		
		
		//score 배열 선언 및 값 대입 (원하는 값을 골라 대입/출력하기)
		
		
		while(isCorrect) {
		System.out.println("[학생 성적 관리 시스템]\n원하는 메뉴의 번호를 골라주세요.");
		System.out.println("┌───────┬───────┬───────┐");
		System.out.println("│1. 입력	│2. 출력	│3. 종료	│");
		System.out.print("└───────┴───────┴───────┘\n▶▷▶▷");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("입력할 학생 수를 입력하세요.\n(숫자 입력)▶");
					len = sc.nextInt();
					sc.nextLine();
					score = new Score[len];
					slen = score.length;
					
					for (int i = 0; i < score.length; i++) {
						System.out.print(i+1+"번째 학생의 이름을 입력하세요.\n☞");
						score[i]=new Score();	//score의 i번째 인덱스를 초기화 시켜줘야 값을 넣을 수 있음
						score[i].setName(sc.nextLine());
					}
					information("학생 이름 저장중");
					for (int i = 0; i < 4; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("\n이름 저장완료");
					
					
					
					
					while(isCorrect2) {
					System.out.println(FONT_RED+"\n[과목 선택] - 해당 과목 숫자 입력"+RESET);
					System.out.println("점수를 입력할 과목을 선택하세요.\n이미 입력한 과목을 선택시 덮어쓰기 됩니다.");
					System.out.print("① 국어  ② 수학  ③ 사회  ④ 과학  ⑤ 영어  ⑥ 입력종료\n▶");
					choice = sc.nextInt();
					sc.nextLine();
					switch(choice) {
						case 1:
							subject = "국어";
							insertKorean(score, subject, slen, sc);
							break;
						case 2:
							subject = "수학";
							insertMath(score, subject, slen, sc);
							break;
						case 3:
							subject = "사회";
							insertSocial(score, subject, slen, sc);
							break;
						case 4:
							subject = "과학";
							insertScience(score, subject, slen, sc);
							break;
						case 5:
							subject = "영어";
							insertEnglish(score, subject, slen, sc);
							break;
						case 6:
							information2("초기 화면으로 돌아갑니다.");
							System.out.println();
							isCorrect2 = false;
							break;
						default :
							System.out.println("올바른 숫자를 골라주세요.");
					}//switch 과목 선택 end
					}//while 과목 선택 end
					break;
					
				case 2:
//					if(score.length==0) {
//						information2("입력된 값이 없습니다. 입력창에서 정보를 입력하고 다시 선택해주세요.\n");
//						break;
//					}
					//출력창
					while(isCorrect3) {
					System.out.println("점수를 확인할 학생의 이름을 입력해주세요.(종료 입력시 초기화면 이동)");
					for (int i = 0; i < score.length; i++) {
						System.out.print(i+1+". "+score[i].getName()+"  ");
					}
					name = sc.nextLine();
					for (int i = 0; i < score.length; i++) {
						if(score[i].getName().equals(name)) {
							System.out.printf(FONT_PURPLE+"\n[%s 학생의 점수]\n"+RESET,score[i].getName());
							score[i].printPoint();
							System.out.println(FONT_PURPLE+"-------------\n"+RESET);
						}
						}
					if(name.equals("종료")) {
						information("초기 화면으로 돌아갑니다.");
						System.out.println();
						isCorrect3 = false;
					}
					}
					break;
					
				case 3:
					information2("학생 성적 관리 시스템을 종료합니다.");
					isCorrect = false;
					break;
			}
			}
		
		
		
		
	}//main end
	
	public static void insertKorean(Score[] scores, String subject, int len, Scanner sc) throws InterruptedException {
		boolean isCorrect = true;
		System.out.print(FONT_BLUE+"\n----------[점수 입력]----------"+RESET);
		while(isCorrect) {
		System.out.println("\n"+subject + " 과목 점수를 입력할 학생의 이름을 입력하세요.");
		for (int i = 0; i < len; i++) {
			System.out.print(i + 1 + "." + scores[i].getName() + "  ");
		}
		System.out.print((len + 1) + ". 전체  " + (len + 2) + ". 종료\n☞");
		String name = sc.nextLine();
		for (int i = 0; i < len; i++) {
			if (scores[i].getName().equals(name)) {
				System.out.print(name + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
				scores[i].setKorean(sc.nextInt());
				sc.nextLine();
				information2("입력되었습니다.");
			}
			if (name.equals("전체")) {
				System.out.print(scores[i].getName() + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
				scores[i].setKorean(sc.nextInt());
				sc.nextLine();
				information2("입력되었습니다.");
			}
		}
		if (name.equals("종료")) {isCorrect = false;}
		}
		System.out.println(FONT_BLUE+"\n----------[입력 종료]----------"+RESET);
	}
	public static void insertMath(Score[] scores, String subject, int len, Scanner sc) throws InterruptedException {
		boolean isCorrect = true;
		System.out.print(FONT_BLUE+"\n----------[점수 입력]----------"+RESET);
		while(isCorrect) {
			System.out.println("\n"+subject + " 과목 점수를 입력할 학생의 이름을 입력하세요.");
			for (int i = 0; i < len; i++) {
				System.out.print(i + 1 + "." + scores[i].getName() + "  ");
			}
			System.out.print((len + 1) + ". 전체  " + (len + 2) + ". 종료\n☞");
			String name = sc.nextLine();
			for (int i = 0; i < len; i++) {
				if (scores[i].getName().equals(name)) {
					System.out.print(name + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setMath(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
				if (name.equals("전체")) {
					System.out.print(scores[i].getName() + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setMath(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
			}
			if (name.equals("종료")) {isCorrect = false;}
		}
		System.out.println(FONT_BLUE+"\n----------[입력 종료]----------"+RESET);
	}
	public static void insertSocial(Score[] scores, String subject, int len, Scanner sc) throws InterruptedException {
		boolean isCorrect = true;
		System.out.print(FONT_BLUE+"\n----------[점수 입력]----------"+RESET);
		while(isCorrect) {
			System.out.println("\n"+subject + " 과목 점수를 입력할 학생의 이름을 입력하세요.");
			for (int i = 0; i < len; i++) {
				System.out.print(i + 1 + "." + scores[i].getName() + "  ");
			}
			System.out.print((len + 1) + ". 전체  " + (len + 2) + ". 종료\n☞");
			String name = sc.nextLine();
			for (int i = 0; i < len; i++) {
				if (scores[i].getName().equals(name)) {
					System.out.print(name + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setSocial(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
				if (name.equals("전체")) {
					System.out.print(scores[i].getName() + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setSocial(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
			}
			if (name.equals("종료")) {isCorrect = false;}
		}
		System.out.println(FONT_BLUE+"\n----------[입력 종료]----------"+RESET);
	}
	public static void insertScience(Score[] scores, String subject, int len, Scanner sc) throws InterruptedException {
		boolean isCorrect = true;
		System.out.print(FONT_BLUE+"\n----------[점수 입력]----------"+RESET);
		while(isCorrect) {
			System.out.println("\n"+subject + " 과목 점수를 입력할 학생의 이름을 입력하세요.");
			for (int i = 0; i < len; i++) {
				System.out.print(i + 1 + "." + scores[i].getName() + "  ");
			}
			System.out.print((len + 1) + ". 전체  " + (len + 2) + ". 종료\n☞");
			String name = sc.nextLine();
			for (int i = 0; i < len; i++) {
				if (scores[i].getName().equals(name)) {
					System.out.print(name + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setScience(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
				if (name.equals("전체")) {
					System.out.print(scores[i].getName() + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setScience(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
			}
			if (name.equals("종료")) {isCorrect = false;}
		}
		System.out.println(FONT_BLUE+"\n----------[입력 종료]----------"+RESET);
	}
	public static void insertEnglish(Score[] scores, String subject, int len, Scanner sc) throws InterruptedException {
		boolean isCorrect = true;
		System.out.print(FONT_BLUE+"\n----------[점수 입력]----------"+RESET);
		while(isCorrect) {
			System.out.println("\n"+subject + " 과목 점수를 입력할 학생의 이름을 입력하세요.");
			for (int i = 0; i < len; i++) {
				System.out.print(i + 1 + "." + scores[i].getName() + "  ");
			}
			System.out.print((len + 1) + ". 전체  " + (len + 2) + ". 종료\n☞");
			String name = sc.nextLine();
			for (int i = 0; i < len; i++) {
				if (scores[i].getName().equals(name)) {
					System.out.print(name + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setEnglish(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
				if (name.equals("전체")) {
					System.out.print(scores[i].getName() + " 학생의 " + subject + " 점수를 입력해주세요 ▶ ");
					scores[i].setEnglish(sc.nextInt());
					sc.nextLine();
					information2("입력되었습니다.");
				}
			}
			if (name.equals("종료")) {isCorrect = false;}
		}
		System.out.println(FONT_BLUE+"\n----------[입력 종료]----------"+RESET);
	}
	
	

	
	
	
	public static void information(String str) throws InterruptedException {
	    char[] charArray = str.toCharArray();
	    for (int i = 0; i < charArray.length; i++) {
			Thread.sleep(100);
			System.out.print(charArray[i]);
		}
	}
	public static void information2(String str) throws InterruptedException {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			Thread.sleep(50);
			System.out.print(charArray[i]);
		}
	}
	
}//main class end
