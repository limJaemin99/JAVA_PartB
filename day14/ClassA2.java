package partB.day14;

//ClassA1의 자식 클래스 : extends(확장하다)
public class ClassA2 extends ClassA1{
	
	double point;
	
	//부모 클래스의 기본생성자가 생략된 상태일때 오류. 기본생성자로만 객체를 생성해야 한다.
	//생략된 기본생성자 코드. *참고 : this()는 현재 자신의 객체. super()는 부모객체를 가리키는 키워드
		public ClassA2() {
			super();	//부모 생성자 호출. 생략된 형식으로 사용됨
		}
		
		
	
	//자식클래스 생성자는 부모클래스 생성자를 먼저 호출(실행)한다.
	// 부모클래스의 객체가 먼저 만들어지고, 자식 필드와 메소드가 추가되어 확장되는 객체가 생성(자식 생성자가 실행됨)
	
	
	public void print() {
		System.out.println("포인트 = "+point);
	}
	
	
	
	
	//자식 객체가 커스텀 생성자를 만드는 경우 = 다양한 예시로 설명은 다음시간에...	
	
	
	
	
}
