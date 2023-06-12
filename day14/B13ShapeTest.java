package partB.day14;

public class B13ShapeTest {
	public static void main(String[] args) {
		
		//shape,Triangle,Circle 객체를 1개씩 생성해보세요.
		Shape sha = new Shape();
		Triangle tri = new Triangle();
		Circle cir = new Circle(2.8);
		
		System.out.println("===첫번째 도형===");
		System.out.println("도형 이름 : "+cir.getShapeName());
		System.out.println("반지름 : "+cir.getRadius());
		System.out.println("높이 : "+cir.getHeight());
		System.out.println("너비 : "+cir.getWidth());
		System.out.println("toString을 이용한 출력 ▶ "+cir.toString());
		System.out.println(cir);	//객체 뒤에 .toString()이 생략된거임
		
		
		System.out.println("\n===두번째 도형===");
		tri.setShapeName("삼각형");
		System.out.println("도형 이름 : "+tri.getShapeName());
		tri.setAngle(60);
		System.out.println("각도 : "+tri.getAngle());
		tri.setHeight(5);
		System.out.println("높이 : "+tri.getHeight());
		tri.setWidth(3);
		System.out.println("너비 : "+tri.getWidth());
		System.out.println("toString을 이용한 출력 ▶ "+tri.toString());
		System.out.println(tri);	//객체 뒤에 .toString()이 생략된거임
		
		System.out.println("\n===Shape 클래스에 직접 값을 대입===");
		sha.setShapeName("사각형");
		sha.setHeight(5);
		sha.setWidth(5);
		System.out.println("toString을 이용한 출력 ▶ "+sha.toString());
		System.out.println(sha);	//객체 뒤에 .toString()이 생략된거임
		
		//테스트를 Shape에 toString을 주석처리 후 실행해보기
		//결과 : toString()을 다시 정의한것이 없을때는 아래와 같다.
		//보기 좋게 필드값 출력하기 위해 toString() 메소드를 다시 정의한 것이다.
/*
		 *System.out.println(cir);	//partB.day14.Circle@26f0a63f
		 *System.out.println(tri);	//partB.day14.Triangle@4361bd48
		 *System.out.println(sha);	//partB.day14.Shape@53bd815b
*/
		
		System.out.println("\n===3개 도형의 넓이를 구해봅시다===");
		System.out.println("Shape 넓이 = "+sha.area());
		System.out.println("Triangle 넓이 = "+tri.area());
		System.out.println("Circle 넓이 = "+cir.area());
		
		
		//사다리꼴 클래스
		LadderShape lad1 = new LadderShape("사다리꼴1",5,8,4);
		LadderShape lad2 = new LadderShape();
		
		System.out.println("\n===lad1 내용===");
		System.out.println("도형 이름 : "+lad1.getShapeName());
		System.out.println("높이 : "+lad1.getHeight());
		System.out.println("윗변 : "+lad1.getTopLength());
		System.out.println("아랫변 : "+lad1.getBottomLength());
		System.out.println("넓이 : "+lad1.area());
		System.out.println(lad1.toString());
		
		
		System.out.println("\n===lad2 직접 값 입력 후 출력===");
		lad2.setShapeName("사다리꼴2");
		lad2.setHeight(8);
		lad2.setTopLength(10);
		lad2.setBottomLength(3);
		System.out.println(lad2.toString());
		
		
		
		
		
		
	}//main end
}//main class end
