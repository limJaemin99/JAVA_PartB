package partB.day14;

//사다리꼴

//private String shapeName;		//도형 이름
//private int width;				//도형 너비
//private int height;				//도형 높이

public class LadderShape extends Shape{
	
	//사다리꼴 넓이 구하는 공식으로 메소드 재정의 해보세요
	//사다리꼴의 넓이 = (윗변 + 아랫변) × 높이 ÷ 2
	
	private int topLength;		//윗변
	private int bottomLength;	//아랫변
	

	///////////day15에 추가////자식 LadderShape의 인스턴스 메소드///////////
	public void iamLadder() {
		System.out.println("I am Ladder - "+super.getShapeName());
		System.out.println("윗변 = "+topLength+", 아랫변 = "+bottomLength);
	}
	///////////////////////////////////////////////////////////////
	
	
	
	//부모클래스의 width = 0으로 사용하지 않음
	
	public LadderShape() {}
	public LadderShape(String shapeName,int height, int topLength, int bottomLength) {
		super(shapeName,height);
		this.topLength = topLength;
		this.bottomLength = bottomLength;
	}
	
	//getter, setter
	//topLength
	public int getTopLength() {
		return topLength;
	}
	public void setTopLength(int topLength) {
		this.topLength = topLength;
	}
	
	//bottomLength
	public int getBottomLength() {
		return bottomLength;
	}
	public void setBottomLength(int bottomLength) {
		this.bottomLength = bottomLength;
	}

	
	
	
	@Override
	public int area() {
		return (topLength+bottomLength)*getHeight()/2;
	}

	@Override
	public String toString() {
		return String.format("도형이름 : %s, 높이 : %d, 윗변 : %d, 아랫변 : %d, 넓이 : %d",
				getShapeName(),getHeight(),topLength,bottomLength,area());
//		return super.toString()+", 윗변 : "+topLength+", 아랫변 : "+bottomLength;
	}
	
	
	
	
	
}
