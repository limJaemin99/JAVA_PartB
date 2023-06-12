package Asolution;

//내부평가 연습문제

//작성자 : 임재민
public abstract class Product {
	
	//[1] Product 클래스에 문자열 타입 ‘상품명’ 필드와 정수형 타입 ‘가격’ 필드를 각각 선언하세요.
		//필드명은 prdName, price 입니다.
	 	//필드 접근 한정자를 protected로 합니다.
	protected int price;
	protected String prdName;
	
	
	//[2] Product 클래를 추상클래스로 변경하고 sell 이라는 추상메소드를 pubic 으로 선언하세요.
	 	// 메소드의 리턴타입은 String, 인자는 Object 1개 입니다.
	public abstract String sell(Object object);
	
	//[3] Bike 클래스에 sell 메소드를 재정의 합니다.
		//실행은 인자 Object 를 전달받아 “추가 할인 행사 - %d %% 인하” 을 문자열로 리턴합니다.
		//String.format() 활용.
	
	//[4] Electronics 클래스에 sell 메소드를 재정의 합니다.
		//실행은 인자 Object 를 전달받아 “묶음 상품 - %s (1set)” 을 문자열로 리턴합니다.
		//String.format() 활용.

	//[5] Bike 클래스에는 int speed 필드를 접근 한정자 private 으로 선언하고 getter,setter 메소드를 public 으로 작성하세요.
	
	//[6] Bike 클래스는 public 생성자가 2개입니다. 디폴트 생성자와 price,prdName,speed 필드를 초기화하는 커스텀 생성자입니다.

	
	

	//문제 구현을 위해 toString 생성
	
	@Override
	public String toString() {
		return String.format("가격 : %d, 상품명 : %s", price, prdName);
	}

	
	
}
