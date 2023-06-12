package partB.day16;

import partB.day12.Member;

public class B16ObjectTypeTest {
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		dog.name = "멍멍이";			//Object 필드에 대입되는 데이터는 String
		
		Animal cat = new Animal();
		cat.name = 99999;			//Object 필드에 대입되는 데이터는 Integer(클래스기 때문에 Integer임)
		
		Animal people = new Animal();
		people.name = new Member();	//Object 필드에 대입되는 데이터는 Member
		
		
		
		System.out.println("===Object 인자가 실수타입===");
		dog.iamAnimal(3.4567);
		
		System.out.println("===Object 인자가 배열 객체===");
		cat.iamAnimal(new String[] {"hello","~냥이"});
		
		System.out.println("===Object 인자가 문자열===");
		people.iamAnimal("자바");
		
		System.out.println("===Object 인자가 클래스 객체===");
		Member member = new Member();
		member.setId("momo"); member.setName("김OO");
		people.iamAnimal(member);
		//실행 결과를 보고 참조하기
		
		//Object타입의 실수 = 실수
		//Object타입의 배열 = 배열 주소값
		//Object타입의 String = String
		
		
		
	}//main end
}//main class end
