package partB.day13;

//어제꺼 복습
public class Product {
	//인스턴스 필드 (전역변수)--------
	private long code;
	private String productName;
	private long price;
	private String company;
	//-------------------------
	// 생성자는 '클래스와 이름이 같은 메소드'이다. 리턴타입은 없는 형식이다.
	// 클래스 내부에 생성자 선언을 생략했다면,
	// 컴파일러는 중괄호{} 블록 내용이 비어있는 기본 생성자(Default Constructor)를 바이트 코드에 자동으로 추가시킨다.
	// 생성자도 메소드이므로 오버로딩이 가능하다.
	// this() 또는 this(매개변수1, ...) 와 같이 생성자 호출도 가능
	public Product() { //예시1
		// 기본 생성자
		this.code = 9999999999l;	//맨 뒤에 l은 long 타입 리터럴 표시
	}
	
	public Product(String productName) {//예시2
		this();		// 기본 생성자(매개변수가 없는 생성자(예시1))를 호출(실행)★★★★★★★★★★★
		//생성자 역할은 초기화
		this.productName = productName;
//		this();		//오류. 다른 생성자를 호출하는건 항상 맨 위에 있어야함.
	}
//	public B06Product(String company) {	//메소드 시그니처(인자 형식과 개수) 동일한 2개가 동시에 존재 못함
//		this.company = company;			// << 이 메소드는 매개변수의 (String) 타입이 같음
//	}
	
	public Product(long price, String company) {//예시4
		this.price = price;
		this.company = company;
	}
	
	public Product(String productName, long price, String company) {//예시5
		this(productName);		//생성자 메소드 중에 String 매개변수 1개인것(예시2)을 호출
		this.price = price;
		this.company = company;
	}
	
	
	//모든 필드값을 초기화하는 생성자를 만들어보세요. 매개변수 4개를 모두 받는 형식
	public Product(long code, String productName, long price, String company) {//예시3
//		super();	//부모클래스의 생성자, 생략 가능
		this.code = code;
		this.productName = productName;
		this.price = price;
		this.company = company;
	}
	
	
	//getter 만들기
	//get >> Ctrl+space >> get ~~~
	public long getCode() {
		return code;
	}
	public String getProductName() {
		return productName;
	}
	public long getPrice() {
		return price;
	}
	public String getCompany() {
		return company;
	}
	
	//setter 만들기
	//set >> Ctrl+space >> set ~~~
	
	public void setCode(long code) {
		this.code = code;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//모든 필드값으로 문자열 생성
	public String product() {
		return String.format("상품코드 = %d\n상품명 = %s\n가격 = %d\n제조사 = %s\n",
				code,productName,price,company);
	}
	
	
	
	
	
	
}
