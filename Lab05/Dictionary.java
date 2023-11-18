
public class Dictionary extends PairMap { // extends ��ӹ��� �θ� Ŭ����

	//count ����
	private int count;
	//������ -> �Ű������� ������ ������ ���� num
	public Dictionary(int num) {
		keyArray = new String[num];
		valueArray = new String[num];
	
		//count �ʱ�ȭ
		this.count = 0;
	}
	
	// PairMap�� ����� ���� 4���� �޼ҵ� �������̵� ����


	//1. get
	public String get(String key) {
	//key ���� ���� value ����, ������ null ����
	for(int i=0; i<keyArray.length; i++) {
		//key ���� ���� value ����
		if(key.equals(keyArray[i])) {
			return valueArray[i];
		}
		//������ null ����
	}
	return "null";
	}

	//2. put
	public void put(String key, String value) {
	//key�� value�� ������ ����, ������ key�� ������, ���� value�� ����
		//������ key�� ������
		//���� value�� ����
		for (int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}
		//������ ���� �������̸� ���� �߰�
		keyArray[count] = key;
		valueArray[count] = value;
		//count ����
		count++;
		
	}

	//3. delete
	public String delete(String key) {
	//key ���� ���� ������(value�� �Բ�) ����, ������ value �� ����
		for(int i=0; i<keyArray.length; i++) {
		//key ���� ���� ������(value�� �Բ�) ����
			if(key.equals(keyArray[i])){	
				//������ �������� value �� String ���� s�� ����
				String s = valueArray[i];
				//key ���� ���� ������ ����
				keyArray[i] = null;
				//value �Բ� ����
				valueArray[i] = null;
				//������ value �� (���� s) ����
				return s;
		}
	}
		//������ �������� ���ٸ� null ����
	return "null";
		
	}
	
	
	//4. length
	//���� ����� �������� ���� ����
	public int length() {
		return count;
	}

	
	
}
