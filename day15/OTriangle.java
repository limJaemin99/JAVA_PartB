package partB.day15;

//B15 연관파일
public class OTriangle extends AShape{
//The type OTriangle must implement the inherited abstract method AShape.resize(int)
	//해석 : OTriangle 클래스는 상속받은 추상메소드 resize(int)를 구현해야한다.
		//해결 후
//The type OTriangle must implement the inherited abstract method AShape.area()
	//해석 : area()도 구현해라
		//Ctrl+space로 오버라이드함
	
	//결론 : 추상클래스의 자식클래스는 모두 재정의해야한다.(override)
	
	private int angle;

	
	//생성자
	public OTriangle() {	//원래는 생성자에 출력문 안씀. 오늘은 예시로 한거임
		System.out.println("자식클래스 OTriangle 의 기본생성자 실행!");
	}
	
	
	public OTriangle(String shapeName,int width, int height, int angle) {
		super(shapeName);
		this.width = width;
		this.height = height;
		this.angle = angle;
	}
	
	public OTriangle(int angle) {
		super();
		this.angle = angle;
	}


	//getter
	public int getAngle() {
		return angle;
	}
	//setter
	public void setAngle(int angle) {
		this.angle = angle;
	}
	

	//override(맨 위 설명 참고)
	@Override
	public void resize(int size) {
		this.angle += size;		//this.angle = this.angle + size;
	}
	@Override
		public int area() {
			return width*height/2;	//protected 관계제어자이기 때문에 불러올 수 있다.
		}


	@Override
	public String toString() {
		return super.toString()+String.format("  각도 : %d", angle);
	}
	
}
