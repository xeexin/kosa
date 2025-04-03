
package ex08.utilPakage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("김연아 박태환 손연재 이휘 김지은 박준 공현진");
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

	}
}
