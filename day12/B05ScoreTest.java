package partB.day12;

import java.util.Scanner;


public class B05ScoreTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Score 객체 생성
		Score Score = new Score();
		boolean status = true;
		boolean status2 = true;
		int choice;
		//각 필드의 값을 키보드로 입력받아 저장하기
		while(status) {
		System.out.println("이름, 국어점수, 영어점수, 과학점수를 입력하세요.\n※이름에 end 입력시 종료");
		System.out.print("이름 : ");
		Score.setName(sc.next());
		if(Score.getName().equals("end")) break;
		
		System.out.print("국어점수 : ");
		Score.setKorea(sc.nextInt());
		System.out.print("영어점수 : ");
		Score.setEnglish(sc.nextInt());
		System.out.print("과학점수 : ");
		Score.setScience(sc.nextInt());
		
		//총점, 평균(소수점 2자리) 구하기
		System.out.println("▶ 총점 : "+Score.sum());
		System.out.printf("▶ 평균 : %.2f\n",Score.average());
		
		// 모든 필드값, 총점, 평균 출력하기
		Score.Member();
		while(status2) {
		System.out.println("다시 시작하려면 ①, 종료하려면 ② 중 선택");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			status2 = false;
			break;
		case 2:
			status = false;
			status2 = false;
			System.out.println("종료합니다.");
			break;
		default :
			System.out.println("※ ①,② 중에 선택하세요\n");
		}
		}
		status2 = true;
		
		
		
		
		}
		sc.close();
	}//main end
}//main class end
