package partB.day15;


public class B15AShapeTest {
	public static void main(String[] args) {
		
//		AShape aShape = new Ashape();	//오류.추상클래스는 객체 생성 못함(그래서 Ctrl+Space해도 제대로 안나옴)
		/////////////////////////////////////
		System.out.println("=====OTriangle=====");
		AShape tri = new OTriangle();
		System.out.println("\n=====OCircle=====");
		AShape cir	= new OCircle(16.5);
		System.out.println("\n=====OLadderShape=====");
		AShape lad = new OLadderShape("사다리꼴(1)",11,13,23);
		System.out.println("━".repeat(14)+"선언 종료"+"━".repeat(14)+"┙\n");
		
		//위 3개 객체 참조값을 배열요소에 저장하기
		AShape[] shapes = new AShape[5];	//AShape 구현객체를 참조할 배열
		
		shapes[0] = tri;
		shapes[1] = cir;
		shapes[2] = lad;
		System.out.println("\n=====shapes[3]=====");
		shapes[3] = new OCircle(22);
		System.out.println("\n=====shapes[4]=====");
		shapes[4] = new OLadderShape("사다리꼴(2)",15,22,25);
		System.out.println("━".repeat(14)+"선언 종료"+"━".repeat(14)+"┙\n");
		
		
		tri.shapeName = "삼각형";	shapes[0].width = 20;	shapes[0].height = 16;
		cir.shapeName = "원(1)";
		shapes[3].shapeName = "원(2)";
		System.out.println("\n======AShape 배열에 저장된 도형 객체 출력 1======");
		for (int i = 0; i < shapes.length; i++) {
			System.out.print(shapes[i].toString());
			System.out.println(", ▶ 넓이 : "+shapes[i].area());
		}
		
		tri.resize(20);
		cir.resize(3);
		lad.resize(3);
		shapes[3].resize(5);
		shapes[4].resize(6);
		
		System.out.println("\n======AShape 배열에 저장된 도형 객체 출력 2======");
		for (AShape s : shapes) {
			System.out.print(s.toString());
			System.out.println(", ▶ 넓이 : "+s.area());
		}
		

		////////////////////////////////////////////////////////////////////////////
		System.out.print("\n"+"━".repeat(50));
		System.out.println("\n======instanceOf 복습문제======\n");
		//instanceOf 복습문제
		//shapes 배열의 객체들을 하나씩 검사하여
		
		//문제 어떻게 풀건지?---------------
		//shapes[] 를 다운캐스팅
		//다운캐스팅한걸 instanceOf 로 문제풀이
		//-----------------------------
		
		// 1) LadderShape 객체인 경우 iamLadder() 메소드를 실행하세요.
		// 2) OCircle 객체인 경우 iamCircle() 메소드를 실행하세요.
		
		System.out.println("1) LadderShape 객체인 경우 iamLadder() 메소드를 실행하세요.");
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof OLadderShape==true) {	//true 생략 가능
				OLadderShape check = (OLadderShape)shapes[i];
				check.iamladder();
			}
		}
		
		System.out.println("======for-each문======");
		for (AShape check : shapes) {
			if(check instanceof OLadderShape) {
				OLadderShape result = (OLadderShape)check;
				result.iamladder();
			}
		}
		
		System.out.print("\n"+"━".repeat(50));
		
		
		
		System.out.println("\n2) OCircle 객체인 경우 iamCircle() 메소드를 실행하세요.");
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof OCircle==true) {	//true 생략 가능
				OCircle check = (OCircle)shapes[i];
				check.iamCircle();
			}
		}
		
		System.out.println("======for-each문======");
		for (AShape check : shapes) {
			if(check instanceof OCircle) {
				OCircle result = (OCircle)check;
				result.iamCircle();
			}
		}
		
		
	}//main end
}//main class end
