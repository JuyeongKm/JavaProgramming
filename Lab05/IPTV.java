
public class IPTV extends ColorTV { // extends 상속받을 부모 클래스 -- color tv
	// ip 저장할 변수 (private)
	private String iptv;

	// 생성자 -> ip, 크기, 색상 수 설정
	public IPTV(String iptv, int size, int color) {
		super(size, color);
		this.iptv = iptv;
	}
	
	// getIP 함수 --> IP 리턴
	public String getIP() {
		return iptv;
	}
	
	// printProperty 함수 --> "나의 IPTV는 IP 주소의 X 인치 Y 컬러" return;
	public void printProperty() {
		System.out.println("나의 IPTV는 " +getIP() + "주소의 " + getSize() + "인치 " + getColor() + "컬러");
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.0.0.1", 32, 2048);
		iptv.printProperty();
		System.out.println("2210701 김주영");
	}

}
