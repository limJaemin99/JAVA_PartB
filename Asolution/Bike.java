package Asolution;

//작성자 : 임재민
public class Bike extends Product{

	//[3] Bike 클래스에 sell 메소드를 재정의 합니다.
		//실행은 인자 Object를 전달받아 “추가 할인 행사 - %d %% 인하” 을 문자열로 리턴합니다.
		//String.format() 활용.
	@Override
	public String sell(Object object) {
		return String.format("추가 할인 행사 - %d %% 인하", object);
	}

	//[5] Bike 클래스에는 int speed 필드를 접근 한정자 private 으로 선언하고 getter,setter 메소드를 public 으로 작성하세요.
	private int speed;

	
	//[6] Bike 클래스는 public 생성자가 2개입니다. 디폴트 생성자와 price,prdName,speed 필드를 초기화하는 커스텀 생성자입니다.
	Bike() {}

	public Bike(int price, String prdName, int speed) {
		super.price = price;
		super.prdName = prdName;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return super.toString()+", 속도 : "+speed;
	}
	
	
	
}//Bike class end

class Electronics extends Product{

	//[4] Electronics 클래스에 sell 메소드를 재정의 합니다.
		//실행은 인자 Object 를 전달받아 “묶음 상품 - %s (1set)” 을 문자열로 리턴합니다.
		//String.format() 활용.
	@Override
	public String sell(Object object) {
		return String.format("묶음 상품 - %s (1set)", object);
	}
	
	
	//문제 구현을 위해 생성자 생성	//원래는 생성자 없이 해야함(노가다 안하려고 만듦)
	public Electronics(int price, String prdName) {
		super.price = price; 
		super.prdName = prdName;
	}
	
	
	
	
	
	
	
}//Electronics class end
