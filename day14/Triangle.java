package partB.day14;

//삼각형 클래스
public class Triangle extends Shape{
	//만약 부모클래스가 기본 생성자가 없다면 자식생성자의 super()에 오류 발생
		//숨어있는 기본 생성자
		public Triangle() {
			super();		//<<<<<<<이 부분
		}
	//부모클래스에 기본생성자를 만들지 않고 자식클래스의 오류를 발생시키지 않으려면
	//부모클래스의 커스텀생성자 형식에 맞춰서 super()를 작성한다.
	//ex) super("ㄱㄴㄷ",0,1);
	//결론 : super()생성자는 있는걸 사용하면 된다.
	
	
	
	//자식클래스의 필드와 메소드
	private int angle;	//삼각형의 각도
	
	//getter
	public int getAngle() {
		return angle;
	}
	//setter
	public void setAngle(int angle) {
		this.angle = angle;
	}
	
	//메소드 재정의(overriding)
	//부모클래스가 정의한 메소드 동작을 자식에 맞도록, 또는 필요한 처리 기능으로 다시 정의하는것이다.
	//오버라이드 단축키 Alt+Shift+v
	@Override
	public int area() {
		return super.area()/2;
	}
	
	
	
	
	
	
	
	
	
}
