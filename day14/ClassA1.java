package partB.day14;


public class ClassA1 {
	
	public int num;
	String title;
	protected String message;
	private String name;	//private 는 getter, setter로 값 입출력 해야함
	
	//기본생성자
	//자식 클래스가 기본 생성자로 객체를 생성할 수 있도록 한다.
		// 부모가 기본생성자가 없으면 자식도 기본생성자를 사용할 수 없다.
	public ClassA1() {
		this.message = "hello~";
	}
	//전체 필드 초기화하는 '커스텀 생성자'
	public ClassA1(int num, String title, String message, String name) {
		super();
		this.num = num;
		this.title = title;
		this.message = message;
		this.name = name;
	}

	//private는 getter, setter로 값 입출력 해야함
	public String getName() {
		return name;
	}
	
	public void setName(String name) {	//업데이트 예정 : name 길이 0이면 오류 발생
		this.name = name;
	}
	
	
	//일반적인 인스턴스 메소드 : 인스턴스 필드 또는 인스턴스 메소드를 사용한다.
	public String classA() {
		return name+","+title+","+message;
	}
	
	//static 메소드 : 객체 생성 없이 동작.		//인스턴스 필드 또는 인스턴스 메소드를 사용하지 않기때문에 가능
		//★static은 static끼리만 사용 가능★
	public static void family() {
		System.out.println("classA 부모 클래스입니다.");
	}
	
	
		
}
