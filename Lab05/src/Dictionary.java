
public class Dictionary extends PairMap { // extends 상속받을 부모 클래스

	//count 선언
	private int count;
	//생성자 -> 매개변수는 저장할 아이템 개수 num
	public Dictionary(int num) {
		keyArray = new String[num];
		valueArray = new String[num];
	
		//count 초기화
		this.count = 0;
	}
	
	// PairMap에 선언된 다음 4개의 메소드 오버라이딩 구현


	//1. get
	public String get(String key) {
	//key 값을 가진 value 리턴, 없으면 null 리턴
	for(int i=0; i<keyArray.length; i++) {
		//key 값을 가진 value 리턴
		if(key.equals(keyArray[i])) {
			return valueArray[i];
		}
		//없으면 null 리턴
	}
	return "null";
	}

	//2. put
	public void put(String key, String value) {
	//key와 value를 쌍으로 저장, 기존에 key가 있으면, 값을 value로 수정
		//기존에 key가 있으면
		//값을 value로 수정
		for (int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}
		//기존에 없던 아이템이면 새로 추가
		keyArray[count] = key;
		valueArray[count] = value;
		//count 증가
		count++;
		
	}

	//3. delete
	public String delete(String key) {
	//key 값을 가진 아이템(value와 함께) 삭제, 삭제된 value 값 리턴
		for(int i=0; i<keyArray.length; i++) {
		//key 값을 가진 아이템(value와 함께) 삭제
			if(key.equals(keyArray[i])){	
				//삭제할 아이템의 value 값 String 변수 s에 저장
				String s = valueArray[i];
				//key 값을 가진 아이템 삭제
				keyArray[i] = null;
				//value 함께 삭제
				valueArray[i] = null;
				//삭제된 value 값 (변수 s) 리턴
				return s;
		}
	}
		//삭제된 아이템이 없다면 null 리턴
	return "null";
		
	}
	
	
	//4. length
	//현재 저장된 아이템의 개수 리턴
	public int length() {
		return count;
	}

	
	
}
