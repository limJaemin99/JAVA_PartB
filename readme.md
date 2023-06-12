### day12 수업내용 요약

### B01MySimpleMath
+ 자바의 Math 클래스 메소드를 간단히 구현해보기
	+ static 메소드 또는 static 필드 : 클래스 이름으로 사용한다.
+ 실행에 필요한 main 메소드 제외하여 이 클래스를 라이브러리 클래스로 만들어 보기
+ 메소드 오버로딩(overloading) : 메소드 시그니쳐에서 메소드 이름은 같고, 인자(매개변수)의 형식과 개수가 다른 형식이 여러개 만들어질 수 있다.

### B02 MyIntegerValue
+ 데이터를 저장하고 그 데이터에 처리기능을 갖는 메소드로 구성되는 클래스
	+ 인스턴스 필드와 인스턴스 메소드로 구성(static이 아님)
	+ 인스턴스는 새로운 객체를 생성(new연산 사용)해서 데이터를 저장하고 실행
+ 접근 한정자 테스트 : public, default(package), private

### B03 Access

### B04 Menber
+ 웹에서 회원가입할때 사용하는 회원정보를 예시로 클래스를 정의
+ private 필드에 대한 접근 메소드 : getter(읽기)(출력), setter(쓰기)(입력)
	+ getter(읽기)(출력) : 현재 필드값을 리턴하는 형식이 필요
	+ setter(쓰기)(입력) : 인자값을 받을 매개 변수 선언 필요

### B05Score : 연습문제

<hr/>

### day13 (05.09)

### B06 Product
+ 생성자는 클래스이름과 동일하며 리턴타입이 없는 메소드
+ 기본생성자만 사용할때는 생략하고 명시적으로 정의하지 않음
+ 생성자는 오버로딩이 가능한 메소드

### B07 Score
+ day12 의 Score 클래스는 기본생성자로 동작함
+ day13 의 Score 클래스는 매개변수 4개를 받아 초기화하는 생성자만 동작함
	+ 기본 생성자의 명시적 정의가 없으므로 기본 생성자 사용 못함
	
### B08 StringConstructor
+ 자바 라이브러리의 String 클래스 생성자들 테스트하기

### B09 User


### B10 UserTest

<hr/>

### day14 (05/10)

### B11 ScoreArrays
+ 05/09 과제 : Score 객체 배열에 (★객체 참조값★)저장하는 연습
+ Score[] students = new Score[7];
	+ students 배열에 저장되는 참조값은 Score 객체를 참조하는 값이다.
	다른 객체를 참조할 수 없다. 예를들어 User 객체는 참조할 수 없는 배열이다.
	+ *이 명령은 Score 객체 7개를 참조할 수 있는 배열을 선언한다*
	

### B12 ClassAFamily
+ ClassA.java 의 자식클래스를 생성해서 테스트
	+ 자식 클래스 partB.day14.ClassA1.java
	+ 자식 클래스 partB.day14.test.ClassA3.java 는 protected 테스트
	+ partB.day14.test.ClassAFamily.java 는 접근 한정자 public, private, default, protected 테스트
	

### B13 ShapeTest
+ 상속 예시
	+ Shape 부모클래스
		+ Triangle, Circle, LaddaerShape 자식클래스
+ 상속의 특징
	+ 자식객체 생성할때 부모생성자 실행 후 자식생성자 실행 - 부모생성자에서 사용 가능한 것을 호출하지 않으면 오류
	+ 자식클래스는 부모의 메소드를 재정의(overriding) 할 수 있다. @Override로 표시.(@는 애노테이션)

![v2](file:///D:/iclass0419/java_workspace/partB/src/TextFile/상속v2.PNG)

<hr/>

### day15 (05/11)

### B14 ShapeV2Test
+ 형변환(Casting)
	+ 기본 자료형 변환 : int, double, char, ... - 자동형변환 / 강제형변환
	+ 클래스 타입의 자료형 변환 : 상속관계에서 부모와 자식클래스 사이의 형변환
+ UpCasting(업캐스팅) : 부모타입 변수에 자식객체 대입하기 (자동캐스팅)
+ DownCasting(다운캐스팅) : 업캐스팅 했던 객체를 다시 자신(자식클래스) 타입 변수로 참조시킬때
+ 다운캐스팅 할때에는 instanceOf 연산으로 타입체크를 꼭 하고, 결과가 참일때만 실행하도록 한다.
	ex) sh instanceOf Circle >>> sh 참조객체는 new Circle(~~) 생성자로 생성된 것인지 true/false로 리턴
	sh instanceOf Circle 결과가 참일때만 Circle로 다운캐스팅 한다. 그렇지 않으면 오류 발생
		
### AShape.java
+ 추상클래스로 선언 / 직접 객체 생성 안함
+ 추상메소드를 반드시 선언해야하는 클래스
+ 추상메소드는 자식클래스가 반드시 (오버라이딩으로) 구현한다(★implements★) /  모든 추상 메소드를 구현해야한다.
+ OCircle, OTriangle, OLadderShape 자식클래스를 구현

### B15 AShapeTest
+ AShape 배열을 생성해서 구현체를 참조시키고, 업/다운캐스팅 연습

### 참고 (1) 상속의 장점
+ 코드의 재사용 (반복된 코드 작성을 줄일 수 있다)
+ 유지보수가 용이하다(쉬워진다)(공통된 필드를 부모 클래스로 묶어놨기때문에 코드의 수정이 쉬워진다)
+ 객체 지향의 다형성 구현(실현)
	+ 다형성 (Polymorphism) 의 사전적 의미는 동질이상
		+ [메소드 재정의]로 구현할 수 있다. area()메소드는 시그니처가 같고(동질) 실행내용은 다르다(이상)
		+ 자식객체 참조를 [업캐스팅]해서 부모타입으로 참조해서 동일집단으로 그룹화(묶다)할 수 있기 때문에 가능하다.

### 참고 (2) final 키워드
+ 필드에 사용할때 static final 은 상수, final은 값 변경 못하는 인스턴스 필드
+ 메소드에 사용할때는 자식클래스가 재정의 할 수 없는 메소드
+ 클래스에 사용할때는 상속할 수 없는 클래스 	
	+ ex) public final Animal{} 클래스라면 자식클래스가 만들어질 수 없다.
+ 결론 : final이 붙으면 변경할 수 없다.

### 참고 (3) Object 클래스
+ 모든 클래스들의 부모클래스(자바 라이브러리 클래스, 개발자가 만든 클래스 전부 포함)
+ 상속은 n차 상속이 가능하다. n차 상속에서 가장 꼭대기에 있는 클래스가 Object 클래스이다.
+ Object 클래스의 메소드는 모든 객체가 상속받는다.(자동상속/extends를 사용하지 않고 자동상속됨)
	+ toString() 재정의를 했던것은 Object의 메소드를 재정의한 것이였음

<hr/>

### day16 (05/12)

### B16 ObjectTypeTest


### Asolution.package
+ [★]내부평가 연습문제[★]



