package partB.day14.test;

import partB.day14.ClassA1;
import partB.day14.ClassA2;

//패키지를 바꾸고 B12의 파일을 복사했을때 오류가 발생함
	//1. 패키지가 바뀌었으므로 import 필요
	//2. 접근 권한이
	//	 num : public >> O
	//	 title : default(앞에 안붙임) >> X
	//	 message : protected >> X 
			//protected로 정의된 필드 또는 메소드는 다른 패키지에서 사용될 때, 자식클래스가 아니면 사용할 수 없다.
			//▶ 자식 클래스에게만 상속시킨다.
		
		//public int num;
		//String title;
		//protected String message;
	//3. 결론 : 다른 패키지에서 사용 가능한 접근 제어자는 public 뿐이다.
public class B12ClassAFamily {
	public static void main(String[] args) {
//★★★오류 : 접근 한정자 문제★★★		

		//부모 객체 생성
		ClassA1 cla1 = new ClassA1();
//오류	cla1.title = "부모";
		cla1.num = 12;
//오류	cla1.message = "테스트";
//		cla1.name;	//name은 private이라 getter,setter로 접근해야함
		
		System.out.println("나는 부모 클래스 : "+cla1.classA());
		
		//자식 객체 생성
		ClassA2 cla2 = new ClassA2();
		
		
		//부모 클래스 ClassA 필드에 값 저장
//오류	cla2.title = "상속";
		cla2.num = 99;
		
		//자식 클래스 ClassA2 필드에 값 저장
//오류	cla2.point = 101.11;
		
		System.out.println("부모 클래스 메소드 실행 결과 : "+cla2.classA());
		System.out.println("num = "+cla2.num);
		
//오류	cla2.message = "헬로";
//오류	System.out.println("protected 필드 변경 = "+cla2.message);
		
		//결론
		//자식 클래스는 부모 클래스의 필드와 메소드를 따로 정의하지 않고 사용할 수 있다.
		//★단, private 는 상속 안됨★
	

		
	}//main end
}//main class end
