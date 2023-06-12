package partB.day14;

public class Score {
	
	//상수 선언 (시험 점수 상한)
	private static final int MAX_POINT = 100;
	
	//필드 선언 (이름 및 국어, 수학, 사회, 과학, 영어 점수)
	private String name;
	private int korean;
	private int math;
	private int social;
	private int science;
	private int english;
	
	
	//getter, setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = Math.min(korean, MAX_POINT);
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = Math.min(math, MAX_POINT);;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = Math.min(social, MAX_POINT);;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = Math.min(science, MAX_POINT);;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = Math.min(english, MAX_POINT);;
	}
	
	public void printPoint() {
		System.out.println("국어 : "+korean+"점");
		System.out.println("수학 : "+math+"점");
		System.out.println("사회 : "+social+"점");
		System.out.println("과학 : "+science+"점");
		System.out.println("영어 : "+english+"점");
	}
	//생성자 생성
	public Score() {} //기본생성자
	
	
 	public Score(String name, int korean, int math, int social, int science, int english) {
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.social = social;
		this.science = science;
		this.english = english;
	}
	
 	
	
	
	
}
