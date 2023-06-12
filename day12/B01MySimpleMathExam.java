package partB.day12;

public class B01MySimpleMathExam {
	public static void main(String[] args) {
		//자바의 Math 클래스처럼 MySimpleMath 테스트하기
		System.out.println("===자바의 Math 클래스처럼 MySimpleMath 테스트하기===");
		
		int result;
		
		result = MySimpleMath.add(23, 45);	//
		System.out.println("MySimpleMath.add(23, 45) = "+result);
		System.out.println("MySimpleMath.add(23, 45) = "+MySimpleMath.add(23, 45));
		
		result = MySimpleMath.subtract(23, 45);	//
		System.out.println("MySimpleMath.subtract(23, 45) = "+result);
		System.out.println("MySimpleMath.subtract(23, 45) = "+MySimpleMath.subtract(23, 45));
		
		long resultl = MySimpleMath.multyply(23, 45);	//
		System.out.println("MySimpleMath.multyply(23, 45) = "+resultl);
		System.out.println("MySimpleMath.multyply(23, 45) = "+MySimpleMath.multyply(23, 45));
		
		result = MySimpleMath.divide(10, 2);	//
		System.out.println("MySimpleMath.divide(10, 2) = "+result);
		System.out.println("MySimpleMath.divide(10, 2) = "+MySimpleMath.divide(10, 2));
		
		result = MySimpleMath.remaind(11, 3);	//
		System.out.println("MySimpleMath.remaind(11, 3) = "+result);
		System.out.println("MySimpleMath.remaind(11, 3) = "+MySimpleMath.remaind(11, 3));
		
		
		//static 필드 확인
		System.out.println("\n===static 필드 확인===");
		System.out.println("MySimpleMath.PI = "+MySimpleMath.PI);
//		MySimpleMath.PI = 3.15;		//오류(static final은 상수이므로 변경 불가능)
		
		System.out.println("MySimpleMath.test = "+MySimpleMath.test);
		MySimpleMath.test = 3.15;	//static 은 변경 가능
		System.out.println("MySimpleMath.test(변경 후) = "+MySimpleMath.test);
		
		//String클래스 메소드의 오버로딩 확인하기
		System.out.println("\n===String클래스 메소드의 오버로딩 확인하기===");
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(1234));
		System.out.println(String.valueOf(56.78));
		char[] testArray = {'a','1','*',' '};
		System.out.println(String.valueOf(testArray));
		System.out.println(String.valueOf(testArray,2,1));
		
		
	}//main end
}//main class end
