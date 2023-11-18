import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookReader {

	public static void main(String[] args) {
		// File 생성 - 파일 정보 (본인 워크스페이스에 맞게): "C:/classJava/2000000_JAVA/Lab08/phone.txt"
		File file = new File("C:/classjava/2210701_JAVA/Lab08/phone.txt");
		// FileReader 선언 - 초기화:null
		FileReader fr = null;
		// 문자를 읽어올 변수 -> 초기화:0
		int c = 0; //int인 이유는 문장 읽을때 int형으로 가져오기때문
		try {
			// FileReader 사용해서 file 읽어오기
			fr = new FileReader(file);
			// while ... fileReader 에서 읽어온 값 (read) 이 != -1
			while((c = fr.read()) != -1) {
				// 화면에 출력 (int to char)
				System.out.print((char)c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fileReader != null --> fileReader.close() with try&catch
			if (fr != null)
				try {
					fr.close();
				} 
			catch (IOException e) {
			
			}
		}
	}

}