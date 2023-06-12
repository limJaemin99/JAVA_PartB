package partB.day13;

import java.util.Scanner;

//자바클래스 String의 생성자 테스트
public class B08StringConstructor {
	public static void main(String[] args) {
		
		//String클래스 생성자의 오버로딩 예시
		
		//매개변수 없는 기본생성자로 객체 생성
		String str1 = new String();
		System.out.println("str1 = "+str1+", 길이 : "+str1.length());		//str1 = "" (null아님)
		
		//매개변수 문자열 1개로 객체 생성
		String str2 = new String("hello hi!");
		System.out.println("str2 = "+str2+", 길이 : "+str2.length());		//str2 = "hello hi!"
		
		//매개변수가 char배열 1개인 생성자
		String str3 = new String(new char[] {'h','e','l','l','o','★'});
		System.out.println("str3 = "+str3+", 길이 : "+str3.length());		//str3 = "hello★"
		
		//참고 : Scanner 클래스의 생성자 System.in 매개변수는 InputStream 타입이다.
		Scanner sc = new Scanner(System.in);
		
		//String 클래스는 ★불변객체★ : 상태(문자열 내용)를 바꿀 수 없는 객체
		String msg = "hello";
		msg = msg+"*hi";	//hello 문자열 + *hi 문자열 결과가 저장되는 객체는 새로 만들어진다.
		System.out.println(msg); //hello*hi
		
		
	}//main end
}//main class end
