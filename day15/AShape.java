package partB.day15;
// abstract 키워드 : 부모클래스를 추상화(구체화되지 않은 상태). 객체를 생성하지 않는 추상 클래스
	 //↓↓↓↓↓↓↓↓					//자식클래스들에게 필요한 추상 메소드 [선언]만 한다({}안에 코드가 없음) ▶ 자식들이 구체화해야할 추상 메소드를 선언
public abstract class AShape {
	//추상클래스 파일 만드는 방법
		// Class 생성창에서 abstract 체크 및 이름 앞에 A를 붙여 추상클래스임을 표시
	
	
	
	//자식클래스는 getter/setter 없이 필드를 사용한다.
	protected String shapeName;
	protected int width;
	protected int height;
	
	
	public AShape() {
		System.out.println("추상클래스 AShape의 기본 생성자 실행 완료!");
	}
	
	public AShape(String shapeName) {
		//this();	<< 위의 기본생성자를 불러옴
		System.out.println("추상클래스 AShape의 커스텀 생성자 실행 완료!");
		this.shapeName = shapeName;
	}
	
	//추상메소드 : 자식클래스가 재정의를 꼭 하고 쓰도록 선언
	public abstract int area();				//넓이 구하는 메소드 예시
	public abstract void resize(int size);	//크기 변경 메소드 예시
	
	//인스턴스 메소드 정의도 가능하다.
	public void aShaper() {
		System.out.println("추상클래스 AShape의 인스턴스 메소드 실행 완료!");
	}

	@Override
	public String toString() {
		return String.format("[도형 : %s, 너비 : %d, 높이 : %d]", shapeName, width, height);
	}

	
	
	
	
	
	
	
	
}
