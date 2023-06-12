package partB.day12;

//sum(), average() 메소드는 인스턴스 필드로 계산(처리)한 결과를 리턴하는 인스턴스 메소드
public class Score {
	// 저장할 값은 name, korea, english, science (3개 과목 점수)
	// 필드는 모두 private (getter/setter 필요)
	// 모든 필드값 문자열로 리턴하는 메소드
	// sum(), average() 메소드
	
	
	private String name;
	private int korea;
	private int english;
	private int science;
	
	
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
