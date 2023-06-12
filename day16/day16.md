## day16


### B16 ObjectTypeTest, Animal
Object타입 연습
instanceOf 활용

### Asolution.package
Product, Bike(Electronics), ProductTest >> 내부평가 연습문제
업/다운캐스팅, instanceOf

### B17 ArrayListTest ★★★★★★★★★★ 중요(공부하기)
Array<E> list = new ArrayList<>();
★데이터를 저장하고 다루는 방식(List, Set, Map)

	- list.add : 값 저장하기
	- list.get : 값 가져오기
	- list.remove(object o) 는 인자로 저장된 데이터를 삭제
		//리턴은 boolean
	ex)list.remove(Integer.valueOf(11)); 은 11이 들어있는 인덱스중 가장 먼저 나오는 애를 삭제함
	
		//만약 11을 전부 삭제하고싶다면 
			while(list.remove(Integer.valueOf(11))) {};
				//remove는 boolean타입이므로 while을 쓴다
	- list.contains(값) : 값이 존재하는가? (값의 존재여부)
	- list.indexOf(값) : 값이 어디에 있는가? (값의 index번호)
	
	제너릭타입, Wrapper 클래스 공부하기