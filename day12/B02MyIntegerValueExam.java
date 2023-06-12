package partB.day12;

public class B02MyIntegerValueExam {
	//클래스는 도면, 객체는 도면을 보고 만든 실체
	public static void main(String[] args) {
		//객체 생성 - new 연산.	생성된 객체를 참조하는 변수 my1, my2
		MyIntegerValue my1 = new MyIntegerValue();
		//저장할 데이터가 다르면 또 객체 생성(새로운 실체)
		MyIntegerValue my2 = new MyIntegerValue();
		
		//1) 인스턴스 필드에 값 저장
		my1.value1 = 23;	my1.value2 = 45;
		my2.value1 = 987;	my2.value2 = 345;
		
		//2) 인스턴스 메소드 실행
		int result;
		
		System.out.println("===my1 실행 결과===");
		result = my1.add();			//덧셈
		System.out.println("my1.add(23, 45) = "+result);
		result = my1.subtract();	//뺄셈
		System.out.println("my1.subtract(23, 45) = "+result);
		result = my1.multiply();	//곱셈
		System.out.println("my1.multiply(23, 45) = "+result);
		result = my1.divide();		//나눗셈(몫)
		System.out.println("my1.divide(23, 45) = "+result);
		result = my1.remain();		//나눗셈(나머지)
		System.out.println("my1.remain(23, 45) = "+result);

		
		
		
		System.out.println("\n===my2 실행 결과===");
		result = my2.add();			//덧셈
		System.out.println("my2.add(987, 345) = "+result);
		result = my2.subtract();	//뺄셈
		System.out.println("my2.subtract(987, 345) = "+result);
		result = my2.multiply();	//곱셈
		System.out.println("my2.multiply(987, 345) = "+result);
		result = my2.divide();		//나눗셈(몫)
		System.out.println("my2.divide(987, 345) = "+result);
		result = my2.remain();		//나눗셈(나머지)
		System.out.println("my2.remain(987, 345) = "+result);
		           
		//MyIntegerValue 클래스에도 static 요소 포함할 수 있음
			//예시는 B01 참고
		
		//3) private 변수 테스트
		System.out.println("\n===private 변수 테스트===");
//		my1.name = "김OO";		//private변수는 변경 불가능
								//자바 객체지향 중 은닉성(필드 또는 메소드를 다른 클래스에서 직접 접근 못하게 한다.(건드리지 못하게 한다.)
		
		//특히 private필드는 읽기/쓰기를 위한 메소드가 필요하다.(private는 메소드를 통해 접근한다.)
		my1.printName();	//값이 없으므로 null값 리턴
		my1.name("김OO");	//this.name = name 으로 2번째 name에 김OO를 입력했고, name1 = name2이므로 name1 = 김OO가 된다
		my1.printName();	//김OO 리턴
		
		//↓public 변수값 리턴할 메소드↓
		System.out.println("my1 객체의 name = "+my1.getName());
		
		
		
	}//main end
}//main class end
