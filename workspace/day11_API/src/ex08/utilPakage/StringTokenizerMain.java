//package ex08.utilPakage;
//
//import java.util.StringTokenizer;
//
//public class StringTokenizerMain {
//	public static void main(String[] args) {
//		StringTokenizer token = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);
//		
//		
//		while (token.hasMoreTokens()) { //다음 요소가 있다면
////			System.out.println(token.nextToken());
//			String str = token.nextToken();
//			
//			if(str.equals("=")) System.out.print("\t");
//			else if(str.equals("|")) System.out.print("\n");
//			else System.out.println(str);
//		}
//
//	}
//}

//package ex08.utilPakage;
//
//import java.util.StringTokenizer;
//
//public class StringTokenizerMain {
//	public static void main(String[] args) {
//		StringTokenizer token = new StringTokenizer("김연아/박태환/ 손연재/ 이휘/ 김지은| 박준 &공현진", "/");
//				//new StringTokenizer("김연아 박태환 손연재 이휘 김지은 박준 공현진");
//		
//		while (token.hasMoreTokens()) {
//			System.out.println(token.nextToken());
//		}
//
//	}
//}

package ex08.utilPakage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("김연아/박태환/ 손연재/ 이휘/ 김지은| 박준 &공현진", "/");
		// new StringTokenizer("김연아 박태환 손연재 이휘 김지은 박준 공현진");

		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

		
		System.out.println("--------------------------");
		
		// split()이용하기
		String str = "김연아/박태환/손연재/이휘/김지은| 박준 &공현진";
		String[] ret = str.split("/");
		for(int x=0; x<ret.length; x++) {
			System.out.println(ret[x]);
		}
	}
}
