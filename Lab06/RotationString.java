import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in, "EUC-KR");
		// 문자열 입력 .. 됩니다 출력.
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		// 문자열 입력 받기 nextLine
		String text = scan.nextLine();
		// 문자열 길이 구해서 저장하기
		int num = text.length();
		// for 0 to 문자열 길이만큼
		for (int i=0; i<num; i++) {
		// 현재 문자열에서 첫글자 가져오기
			String start = text.substring(0,1);
		// 나머지 글자 다 가져오기
			String str = text.substring(1);
		// 문자열 = 나머지글자 + 첫글자
			text = str + start;
		// 문자열 출력
			System.out.println(text);
		}
		// 스캐너 닫기
		scan.close();
		
		System.out.print("2210701 김주영");

	}

}
