package partB.day12;

//데이터를 저장하고 그 데이터에 처리기능을 갖는 메소드로 구성되는 클래스
	//인스턴스 필드와 인스턴스 메소드로 구성(static이 아님)
		//인스턴스는 새로운 객체를 생성해서 데이터를 저장하고 실행
public class B02MyIntegerValue {
	
		//1) 클래스의 특성, 즉 인스턴스 필드 선언
		int value1;		//default 또는 package 접근 한정
		int value2;
		
		//3) private 변수 선언과 테스트
		//private 변수 저장할 메소드
		private String name;
		public void name(String name) {
			this.name = name;	//이 객체의 name 필드값을 매개변수 name으로 해라(참조값 받아라)
		}
		//public 변수값 리턴할 메소드
		public String getName() {
			return name;
		}
		//private 변수 출력할 메소드
		public void printName() {
			System.out.println("이 객체의 name = "+name);
//			System.out.println(count);	//오류 : 초기화 없음
		}
		
		
		
		//4) public 변수 선언과 전역변수 기본값 테스트 (B03에 사용함)
		public String message;
		public int result;
		public boolean isOK;
		
		
		
		//2) 처리기능(동작), 즉 인스턴스 메소드 선언
		public int add() {
			return value1+value2;
		}//덧셈
		
		public int subtract() {
			return value1-value2;
		}//뺄셈
		
		public int multiply() {
			return value1*value2;
		}//곱셈
		
		public int divide() {
			return value1/value2;
		}//나눗셈(몫)
		
		public int remain() {
			return value1%value2;
		}//나눗셈(나머지)
		
		
		
		
		
		
		
		
}
