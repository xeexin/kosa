package ex03.operator;

public class OperatorTest3 {
	public static void main(String[] args) {

		// 삼항 연산자(조건 연산자)
		// (조건) ? 참 : 거짓;

		int x = 3, y = 5, z = 7, ret;
		// ret = (x > y) ? x : y;
		ret = (x > y) ? x : 
							(y > z) ? y : z;
		System.out.println(ret);

	}
}

/*
package ex03.operator;

public class OperatorTest3 {
	public static void main(String[] args) {

		// 삼항 연산자(조건 연산자)
		// (조건) ? 참 : 거짓;

		int x = 3, y = 5, z = 7, ret;
		// ret = (x > y) ? x : y;
		ret = (x > y) ? x : 
							(y > z) ? y : z;
		System.out.println(ret);

	}
}
//*/

/*
 * package ex03.operator;
 * 
 * public class OperatorTest3 { public static void main(String[] args) {
 * 
 * // 삼항 연산자(조건 연산자) // (조건) ? 참 : 거짓;
 * 
 * int su = 10; String str;
 * 
 * // str = (su % 2 == 0) ? "even" : "odd"; str = (su % 2 != 0) ? "홀수" : "짝수";
 * System.out.println(su + ":" + str);
 * 
 * } }
 */