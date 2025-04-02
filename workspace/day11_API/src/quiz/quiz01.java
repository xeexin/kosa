package quiz;

import java.util.Scanner;

/**
 * String str = ""; -> 임의적인 문자열 입력 받아서 대문자는 소문자로 소문자는 대문자로 출력
 */

public class quiz01 {
	public static void main(String[] args) {

		System.out.print("문자열을 입력하세요 : ");
		String str = new Scanner(System.in).next();

		System.out.println("입력 받은 문자열 : " + str);

		String ret = "";

		for (int x = 0; x < str.length(); x++) {
			if (str.charAt(x) >= 'a' && str.charAt(x) <= 'z') {
				ret += ((char) (str.charAt(x) - (char) ('a' - 'A')));
			} else if (str.charAt(x) >= 'A' && str.charAt(x) <= 'Z') {
				ret += ((char) (str.charAt(x) + (char) ('a' - 'A')));
			} else
				ret += str.charAt(x);
		}

		System.out.println("대소문자 변경한 문자열 : " + ret);
	}
}
