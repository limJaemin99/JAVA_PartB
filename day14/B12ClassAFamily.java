package partB.day14;

public class B12ClassAFamily {
	public static void main(String[] args) {
		
		//부모 객체 생성
		ClassA1 cla1 = new ClassA1();
		cla1.title = "부모";
		cla1.num = 12;
		cla1.message = "테스트";
//		cla1.name;	//name은 private이라 getter,setter로 접근해야함
		
		System.out.println("나는 부모 클래스 : "+cla1.classA());
		
		//자식 객체 생성
		ClassA2 cla2 = new ClassA2();
		
		
		//부모 클래스 ClassA 필드에 값 저장
		cla2.title = "상속";
		cla2.num = 99;
		
		//자식 클래스 ClassA2 필드에 값 저장
		cla2.point = 101.11;
		
		System.out.println("부모 클래스 메소드 실행 결과 : "+cla2.classA());
		System.out.println("num = "+cla2.num);
		
		cla2.message = "헬로";
		System.out.println("protected 필드 변경 = "+cla2.message);
		
		//결론
		//자식 클래스는 부모 클래스의 필드와 메소드를 따로 정의하지 않고 사용할 수 있다.
		//★단, private 는 상속 안됨★
		
		
		
	}//main end
}//main class end
