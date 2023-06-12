package test;

import partB.day12.MyIntegerValue;

public class B03AccessTest {
	public static void main(String[] args) {
		//MyIntegerValue의 필드 접근 범위 확인
		MyIntegerValue my = new MyIntegerValue();
//		my.value1 = 23;		//오류
//		my.value2 = 45;		//오류	//패키지 접근 한정 필드 value1, value2는 다른 패키지에서는 접근 불가
		
		System.out.println("===my.message===\n초기상태 = "+my.message);	//null
		my.message = "hi~";
		System.out.println("값 대입 후 = "+my.message);	//hi~
		
		System.out.println("\n===my.result===\n초기상태 = "+my.result);	//0
		my.result = 123;
		System.out.println("값 대입 후 = "+my.result);		//123
		
		System.out.println("\n===my.isOK===\n초기상태 = "+my.isOK);		//false
		my.isOK = true;
		System.out.println("값 대입 후 = "+my.isOK);		//true
		
		
		
	}//main end
}//main class end
