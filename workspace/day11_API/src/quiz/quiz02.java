package quiz;

/**
 * String str="ABC def kbsmbbc 123 BB"; 주어진 문자열에서 대문자 개수와 소문자 개수 출력하는 프로그램 완성
 */
public class quiz02 {
	public static void main(String[] args) {
		String str = "ABC def kbsmbbc 123 BB";
		int cntUpper = 0, cntLower = 0;

		for (int x = 0; x < str.length(); x++) {
			if (str.charAt(x) >= 'A' && str.charAt(x) <= 'Z') {
				cntUpper++;
			}
			if (str.charAt(x) >= 'a' && str.charAt(x) <= 'z') {
				cntLower++;
			}
		}

		System.out.println("대문자 : " + cntUpper + "개\t소문자 : " + cntLower + "개");
	}

}
