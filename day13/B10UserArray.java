package partB.day13;

import java.util.Scanner;

//객체의 배열 연습.	String배열을 참고하세요.
public class B10UserArray {
	public static void main(String[] args) {
		
		User momo = new User("twice1", "모모", 27, 100);
		User nayeon = new User("twice2", "나연", 25, 110);
		User dahyeon = new User("twice3", "다현", 28, 120);
		User zuwi = new User("twice4", "쯔위", 24, 133);
		
		
		//1. 위의 4개 객체를 저장할 배열을 배열크기 7로 선언하기 (배열이름은 twice)
			//선언된 배열에 4개의 객체를 저장하세요.
		User[] twice = new User[7];
		twice[0] = momo;
		twice[1] = nayeon;
		twice[2] = dahyeon;
		twice[3] = zuwi;
		
		//객체 참조변수값을 배열에 전달한 결과 확인
		System.out.println("===객체 참조변수값을 배열에 전달한 결과 확인===");
		System.out.println(twice[0]);
		System.out.println(momo);
		System.out.println(twice[0].user());
		System.out.println(momo.user());
		System.out.println("결론 : twice[0] 과 momo 가 저장한 값은 동일하다. 즉, 같은 객체를 참조하고 있다.\n");
		
		//2. 위의 선언한 배열의 요소를 모두 필드값 출력해보세요. 
		System.out.println("===배열의 객체 참조상태 확인===");
		for (int i = 0; i < twice.length; i++) {
			System.out.println(twice[i]);
		}
		
		System.out.println("\n===배열이 참조하는 객체의 필드값 출력===");
		for (int i = 0; i < twice.length; i++) {
			if(twice[i] != null)
			System.out.println(twice[i].user()); //객체가 null 일때는 메소드 실행 오류이므로 위의 if문을 생성
		}
		
		
		
		//3. 새로운 객체를 생성해서 배열 인덱스 4 에 저장해보세요.
		twice[4] = new User("twice5", "사나", 22, 166);
		// User newUser = new User("twice5", "5번쨰", 22, 166);
		// twice[4] = newUser 	와 같음
		//객체 참조변수를 선언하지 않고 바로 배열 요소로 대입하기
		
		System.out.println("\n===새로운 객체를 index4에 대입한 후===");
		for (int i = 0; i < twice.length; i++) {
			if(twice[i] != null)
				System.out.println(twice[i].user()); //객체가 null 일때는 메소드 실행 오류이므로 위의 if문을 생성
		}
		
		
		
		//4. 배열에서 참조하는 객체는 User 타입입니다. - User 객체의 name 필드만 출력하기
		System.out.println("\n===twice 배열에 저장된 User 객체의 name 필드 출력===");
		for (int i = 0; i < twice.length; i++) {
			if(twice[i] != null) System.out.println(twice[i].getName());
		}
		
		
		
		//5. User가 불변객체로 정의되었으므로 키보드 입력값으로 객체를 생성한다면?
		System.out.println("\n===키보드 입력값으로 객체를 생성한다면?===");
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력\n☞ ");
		String id = sc.nextLine();
		System.out.print("이름 입력\n☞ ");
		String name = sc.nextLine();
		System.out.print("나이 입력\n☞ ");
		int age = sc.nextInt();
		System.out.print("점수 입력\n☞ ");
		int point = sc.nextInt();
		
		twice[5] = new User(id, name, age, point);
		
		System.out.println(twice[5].user());
		
		twice[6] = nayeon;	//이미 생성된 객체를 6번 인덱스로 참조(귀찮아서)
		
		
		//6. twice 배열에 저장된 객체들의 age 필드값 평균을 구해보세요.
		System.out.println("\n===twice 배열에 저장된 객체들의 age 필드값 평균을 구해보세요.===");
		double[] avg = new double[7];
		double sum = 0;
		
		for (int i = 0; i < avg.length; i++) {avg[i] = twice[i].getAge();}
		
		for (double d : avg) {sum += d;}
		
		double result = sum/avg.length;
		System.out.println(String.format("평균나이 : %.1f세",result));
		
		
		//선생님 답변
		System.out.println("\n===선생님 답변===");
		sum=0;
		for (int i = 0; i < avg.length; i++) {
			if(twice[i] != null) sum += twice[i].getAge();
		}
		System.out.println("합계 = "+sum);
		System.out.println("평균 = "+sum/twice.length);
		
		//index 4,6이 null값일때
		System.out.println("\n===index 4,6이 null값일때===");
		sum=0;
		int count=0;
		twice[4] = null; twice[6] = null;
		for (int i = 0; i < avg.length; i++) {
			if(twice[i] != null) {
				count++;
				sum += twice[i].getAge();
			}
		}
		System.out.println("합계 = "+sum);
		System.out.println("평균 = "+sum/twice.length);
		System.out.println("null이 아닌 객체의 개수 = "+count);
		
		
		
		
	}//main
}//main class