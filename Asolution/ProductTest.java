package Asolution;

//작성자 : 임재민
public class ProductTest {
	public static void main(String[] args) {
		//[*] 다음 문제는 main 메소드에 작성하고 , 구현코드 위에 문제번호를 주석으로 표기해 주세요.(ProductTest.java)
		
		//[1] main 메소드에 Product 배열(크기는 10) cart 를 선언합니다.
		Product[] cart = new Product[10];
		
		//cart 배열이 다음과 같은 객체를 참조값하도록 합니다.
		cart[0] = new Bike(123000,"MTB",25);
		cart[1] = new Electronics(35000, "USB");
		cart[3] = new Bike(99000,"삼천리",15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg냉장고");
		
		//[3] 위 1번에 생성된 cart 배열 상품 중 가격이 10만원 이상인 것을 출력하세요.
			//출력은 toString 메소드로 합니다
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] != null && cart[i].price >= 100000 && cart[i] instanceof Bike) {
					Bike result = (Bike)cart[i];
					System.out.println("cart index = "+i+", "+result.toString());
			}//Bike if end
			if(cart[i] != null && cart[i].price >= 100000 && cart[i] instanceof Electronics) {
					Electronics result = (Electronics)cart[i];
					System.out.println("cart index = "+i+", "+result.toString());
			}//Electronics if end
		}//for end
		
		//선생님 답변(다운캐스팅 안하는 방법)
		for(int i=0;i<cart.length;i++) {
			if(cart[i]!=null && cart[i].price >= 100000) {
				System.out.println("cart index=" + i + ",상품명=" + cart[i].prdName 
						+ ",가격=" + cart[i].price);  //toString()은 여러분이 코딩하세요.
			}
		}

		
		
		
	}//main end
}//main class end
