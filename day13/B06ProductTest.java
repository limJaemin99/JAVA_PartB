package partB.day13;

public class B06ProductTest {
	public static void main(String[] args) {
//		new Product();	// new Product();에서 new 연산이 뒤에 나오는 Product() 생성자를 호출(실행)하라는 뜻
		//↑위와 같이 객체를 생성하면 사용을 위해 변수에 담는다↑
		
		//첫번째 예시
		Product tv = new Product();
		System.out.println(tv.product());
		
		//두번째 예시
		Product audio = new Product("LG블루투스 오디오");
		System.out.println(audio.product());
		
		//세번째 예시 (전체 필드에 대한 생성자)
		Product all = new Product(76763434,"그램",2200000,"LG");
		System.out.println(all.product());
		
		//네번째 예시
		Product snack = new Product(5000, "오리온");
		System.out.println(snack.product());
		
		//다섯번째 예시
		Product pizza = new Product("피자",32000,"도미노");
		System.out.println(pizza.product());
		//생성자 메소드 중에 String 매개변수 1개인것(예시2)을 호출
			//>>기본 생성자(매개변수가 없는 생성자(예시1))를 호출(실행)
		
	}//main end

}//main class end
