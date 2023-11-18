
public class Km2Mile extends Converter{ // extends ��ӹ��� �θ� Ŭ����
	// ������ --> KM�� mile ���� ����
	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}
	
	// ���� ��ȯ �Լ�(convert) ����
	protected double convert(double src) {
		return (src / ratio);
	}
	
	// ���� ������ srcString()
	protected String srcString() {
		return "Km";
	}
	
	// �ٲ� ������ destString()
	protected String destString() {
		return "mile";
	}
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
		System.out.println("2210701 ���ֿ�");
	}

}
