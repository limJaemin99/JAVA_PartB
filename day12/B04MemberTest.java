package partB.day12;

import java.util.Arrays;

public class B04MemberTest {
	public static void main(String[] args) {
		Member momo = new Member();
		
		System.out.println("===momo 객체의 초기상태===");
		System.out.println(momo.getId());
		System.out.println(momo.getName());
		System.out.println(momo.getAge());
		System.out.println(momo.getPoint());
		
		
		//===momo 객체의 필드값 set===
		momo.setId("momo");
		momo.setAge(27);
		momo.setName("김모모");
		momo.setPoint(567.4);
		String[] msg = {"hi","하이" ,"hello", "헬로"};
		momo.setMessage(msg);
		
		
		System.out.println("\n===momo 객체의 현재상태===");
		System.out.println(momo.getId());
		System.out.println(momo.getName());
		System.out.println(momo.getAge());
		System.out.println(momo.getPoint());
		System.out.println(Arrays.toString(momo.getMessage()));
		
		
		System.out.println("\n===momo 객체의 필드값 정보===");
		System.out.println(momo.member());
		
	}//main end
}//main class end
