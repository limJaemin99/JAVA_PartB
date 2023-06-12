package partB.day15;

public class OLadderShape extends AShape {
	
	private int topLength;		//윗변
	private int bottomLength;	//아랫변
	
	
	//생성자
	public OLadderShape() {
		System.out.println("자식클래스 OLadderShape 기본생성자 실행!");
	}
	
	public OLadderShape(String shapeName,int height, int topLength, int bottomLength) {
			super(shapeName);	//super() 나 this() 는 생성자의 맨 위에 와야함
			System.out.println("자식클래스 OLadderShape 커스텀생성자 실행!");
			this.height = height;
			this.topLength = topLength;
			this.bottomLength = bottomLength;
		}



	//getter, setter
	public int getTopLength() {
		return topLength;
	}
	public void setTopLength(int topLength) {
		this.topLength = topLength;
	}
	public int getBottomLength() {
		return bottomLength;
	}
	public void setBottomLength(int bottomLength) {
		this.bottomLength = bottomLength;
	}
	
	//메소드
	public void iamladder() {	
		System.out.println("I am Ladder - "+super.shapeName);
		System.out.println("윗변 = "+this.topLength+", 아랫변 = "+this.bottomLength);
	}
	
	
	//추상클래스를 상속받기 위해 오버라이딩
	@Override
	public int area() {
		return (topLength+bottomLength)*height/2;
	}
	@Override
	public void resize(int size) {
		this.topLength += size;	
		this.bottomLength += size;	
	}

	@Override
	public String toString() {
		return super.toString()+String.format("  윗변 : %d, 아랫변 : %d", topLength, bottomLength);
	}
	
	
	
	
	
	
}
