package partB.day14;

//원 클래스
public class Circle extends Shape{
	
	//원에는 반지름 필드 추가
	private double radius;		//반지름
	
	
	///////////day15에 추가////자식 Circle의 인스턴스 메소드///////////
	public void iamCircle() {
		System.out.println("I am Cricle - "+super.getShapeName());
		System.out.println("반지름 = "+radius);
	}
	///////////////////////////////////////////////////////////////
	
	
	//getter
	public double getRadius() {
		return radius;
	}
	//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//자식클래스 커스텀 생성자
	public Circle(double radius) {
		super("원",(int)(4*radius),(int)(2*radius));		//원 크기에 근접한 값으로 너비, 높이를 가정
		this.radius = radius;
	}
	
	
	//오버라이드 설명은 Triangle 클래스에 있음
	//단축키 : Alt+Shift+v
	@Override
	public int area() {
		return (int)(Math.PI*radius*radius);
	}
	//부모 area() 메소드 리턴타입이 int이므로 int로 캐스팅
	//리턴타입을 변경하면 오버라이딩이 아님
	
	
	
	
	
	
}
