package partB.day15;

import partB.day14.Circle;
import partB.day14.LadderShape;
import partB.day14.Shape;
import partB.day14.Triangle;

//중요한건 1),2),3),4) 로 체크해뒀음
public class B14ShapeV2Test {
	public static void main(String[] args) {
		
	LadderShape lad = new LadderShape("사다리꼴1", 7, 9, 14);
	Circle cir = new Circle(13);
	
	lad.iamLadder();
	System.out.println();
	cir.iamCircle();
	
	System.out.println("업캐스팅 (자식 ▶ 부모 = 자동캐스팅)");
	// 1) 클래스 캐스팅1 : 부모타입으로 자식 객체를 참조할 수 있다.(자동캐스팅)
		//자식이니까 부모를 참조할 수 있다.
	Shape sha1 = new LadderShape("사다리꼴2",17,13,21);
	Shape sha2 = new Triangle();
	Shape sha3 = new Circle(9);
	
	//위에서 만든 객체도 가능
	Shape sha4 = lad;	//위의 사다리꼴1 객체의 참조값을 sha4에 대입
	Shape sha5 = cir;	//위의 cir 객체의 참조값(반지름)을 sha5에 대입
	
//	sha4.iamLadder();	//sha4와 ls는 동일한 객체를 참조하고있는 중.
						//하지만 타입에 따라 메소드 호출 여부가 정해진다.
	
//	sha5.iamCircle();	//위와 같은 이유로 오류
	
//	sha1.iamLadder();
//	Sha3.iamCircle();	//LadderShape 객체이지만 부모타입 sha1으로 참조
	
	
	System.out.println("다운캐스팅 (자식 ◀ 부모 = 강제캐스팅)");
	// 2) 클래스 캐스팅2 : 자식타입 변수로 부모타입 참조객체를 변환할 수 있는지? (강제캐스팅)(수동)
//	LadderShape lad2 = sh1;		//오류. LadderShape 객체이지만 부모타입으로 참조 중
	
	LadderShape lad2 = (LadderShape)sha1;	//형변환을 강제로 시켜줘야함
	lad2.iamLadder();
	
	
	
	
	//문제 : 아래 명령어는 실행 가능?
	System.out.println("부모타입 객체를 생성하여 자식타입 변수로 참조시키기(가능?)");
//	LadderShape shape = (LadderShape)new Shape("도형",0,0);	//문법적으로는 가능. Exception 발생
//	shape.iamLadder();	//오류. 실제 객체가 Shape이므로 오류

	System.out.println("Circle 객체를 Shape 타입으로 참조하고 그것을 다시 LadderShape으로 캐스팅 가능?");
//	LadderShape lad3 = (LadderShape)sha5;	//문법적으로는 가능
//	lad3.iamLadder();	//실행했을때 실제 객체가 Circle이므로 오류
	//오류. iam'Ladder'는 실제 객체가 LadderShape 일때만 오류 없이 실행 가능
	
	
	
	
	// 3) 강제캐스팅에는 타입체크가 필요하다 ▶ instanceOf
	System.out.println("\n===Shape 타입으로 참조하는 변수 sha1 ~ sha5에 대해 실제 객체가 LadderShape인지 검사===");
	System.out.println("sha1 instanceOf LadderShape = "+(sha1 instanceof LadderShape));	//true
	System.out.println("sha2 instanceOf LadderShape = "+(sha2 instanceof LadderShape));
	System.out.println("sha3 instanceOf LadderShape = "+(sha3 instanceof LadderShape));
	System.out.println("sha4 instanceOf LadderShape = "+(sha4 instanceof LadderShape));	//true
	System.out.println("sha5 instanceOf LadderShape = "+(sha5 instanceof LadderShape));
	
	System.out.println("\n===Shape 타입으로 참조하는 변수 sha1 ~ sha5에 대해 실제 객체가 Circle인지 검사===");
	System.out.println("sha1 instanceOf Circle = "+(sha1 instanceof Circle));
	System.out.println("sha2 instanceOf Circle = "+(sha2 instanceof Circle));
	System.out.println("sha3 instanceOf Circle = "+(sha3 instanceof Circle));	//true
	System.out.println("sha4 instanceOf Circle = "+(sha4 instanceof Circle));
	System.out.println("sha5 instanceOf Circle = "+(sha5 instanceof Circle));	//true
	
	Shape shape = new Shape("도형",10,10);
	System.out.println("\n===부모 Shape 객체를 LadderShape 또는 Circle 검사 ===");
	System.out.println("shape instanceOf LadderShape = "+(shape instanceof LadderShape));	//false
	System.out.println("shape instanceOf Circle = "+(shape instanceof Circle));				//false
	
	// 4) 결론 : instanceOf로 체크한 타입이 true인 경우에만 해당 클래스로 다운캐스팅(부모▶자식,강제,수동)을 할 수 있다.
	
	
	
	
	
	}
}
