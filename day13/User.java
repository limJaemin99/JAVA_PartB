package partB.day13;

//불변객체로 정의하는 예시
	//1. 필드는 모두 final
	//2. 커스텀생성자로 모든 필드 초기화
	//3. getter 메소드만 정의
public class User {
	
	//4. 상수 적용 예시
	private static final double MAX_POINT = 10000;	//point 필드값 최대는 10000
	//절대 변하지 않는 변수를 사용할때 사용(수정시에는 변수 값만 수정하면 되므로 편함)
	
	
	
	//final은 값의 변경이 불가능
	private final String id;
	private final String name;
	private final int age;
	private double point;
	
	//커스텀 생성자
	public User(String id, String name, int age, double point) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.point = point;
	}
	
	
	//모든 필드값 정보 출력 문자열
	public String user() {
		return String.format("id = %s , name = %s , age = %d , point = %.2f",
				id, name, age, point);
	}
	
	
	//getter, setter (final은 단축키로 setter를 만들 수 없다)
	//단축키 : Alt+Shift+s >> r
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getPoint() {
		return point;
	}


	//아래 setter 는 오류 : final 필드는 변경 불가
//	public void setID(String id) {
//		this id = id;
//	}
	
	//final이 없는 point는 setter 생성 가능
	public void setPoint(double point) {
		if(point <= MAX_POINT)
			this.point = point;
			else this.point = MAX_POINT;
//		this.point = Math.min(point, MAX_POINT);	//if를 안쓰는 방법
	}
	
	
	
	
	
	
}
