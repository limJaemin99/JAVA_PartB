package partB.day12;

import java.util.Scanner;

public class B05ScoreWhileTest {
	public static void main(String[] args) {
		// Score 객체를 생성하고
		// 각 필드의 값을 키보드로 입력받아 저장하기
		// 총점, 평균(소수점 2자리) 구하기
		// 모든 필드값, 총점, 평균 출력하기
		
		// Score 객체 생성
		Score Score = new Score();
		
		//각 필드의 값을 키보드로 입력받아 저장하기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 국어점수, 영어점수, 과학점수를 입력하세요.");
		System.out.print("이름 : ");
		Score.setName(sc.next());
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
		
		sc.close();
	}//main end
}//main class end
