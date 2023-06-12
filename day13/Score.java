package partB.day13;

//day12 Score 클래스로 생성자 동작 확인
//기본생성자 동작 여부를 day12의 score클래스와 비교가 핵심

//매개변수가 있는 생성자를 만들었을때(오버로딩) 기본생성자도 사용하고 싶으면 꼭 정의를 해야한다.
//아래 생성자에서 this(); 오류가 발생하는 이유↑
public class Score {
	
	
	private String name;
	private int korea;
	private int english;
	private int science;
	
	//생성자를 day13에서 배우고 나서 보니, 여기는 기본생성자가 생략된 상태
	//객체 생성시에는 기본생성자만 실행이 가능하다.
	
	//이 Score 클래스는 기본 생성자로 객체를 생성할 수 없다.
	public Score(String name, int korea, int english, int science) {
//		this();		//기본 생성자가 없기 때문에 오류 발생
		this.name = name;
		this.korea = korea;
		this.english = english;
		this.science = science;
	}
	
	//getter(읽기, 출력)
	public String getName() {
		return name;
	}
	public int getKorea() {
		return korea;
	}
	public int getEnglish() {
		return english;
	}
	public int getScience() {
		return science;
	}
	
	//setter(쓰기, 입력)
	public void setName(String name) {
		this.name = name;
	}
	public void setKorea(int korea) {
		this.korea = korea;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	
	//sum 과 average 는 인스턴스 메소드로 만든다.
	//sum 메소드
	public int sum() {
		return korea + english + science;
	}
	
	//average 메소드
	public double average() {
		return (double)sum()/3;
	}
	
	
	
	//모든 필드값 문자열로 리턴하는 메소드
	public void Member() {
		System.out.println(String.format("\n[필드값]\nname = %s\nkorea = %d\nenglish = %d\nscience = %d\nsum = %d\naverage = %.2f\n",
				name,korea,english,science,sum(),average()));
	}
}
