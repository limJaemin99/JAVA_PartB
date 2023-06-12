package partB.day15;

public class OCircle extends AShape{
	
	private double radius;		//반지름

	
	//생성자
	public OCircle() {	//원래는 생성자에 출력문 안씀. 오늘은 예시로 한거임
		System.out.println("자식클래스 OCricle 의 기본생성자 실행!");
	}
	
	public OCircle(double radius) {
		System.out.println("자식클래스 OCircle 의 커스텀 생성자 실행!");
		this.radius = radius;
	}
	
	//자식클래스 커스텀 생성자
	public OCircle(String shapeName, double radius) {
		super(shapeName);
		System.out.println("자식클래스 OCircle 의 커스텀 생성자 실행!");
		this.radius = radius;
	}
	//메소드
		public void iamCircle() {	
			System.out.println("I am Circle - "+super.shapeName);
			System.out.println("반지름 = "+radius);
		}
	
	//getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	//추상클래스를 상속받기 위해 오버라이딩
	@Override
	public int area() {
		return (int)(Math.PI*radius*radius);
	}

	@Override
	public void resize(int size) {
		this.radius += size;
	}

	@Override
	public String toString() {
		return super.toString()+String.format("  반지름 : %.1f", radius);
	}
	
	
	
	
}
