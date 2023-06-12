package partB.day14.test;

import partB.day14.ClassA1;

//protected 사용을 위해 ClassA1을 상속받은 클래스
//protected 필드 message는 다른 패키지에서 사용할 수 있는 이유는? ClassA1을 상속했기 때문
public class ClassA3 extends ClassA1{

	public void test() {
		super.message = "다른 패키지의 자식 클래스 입니다.";
		this.message = "다른 패키지의 자식 클래스 입니다.";
		//message는 부모필드이므로 자식입장에서는 super, this 둘 다 사용가능(정확히는 super)
		System.out.println("ClassA1 의 message = "+message);
	}
	
	
}
