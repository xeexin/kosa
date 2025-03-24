package ex05.For;

public class Quiz01 {
	public static void main(String[] args) {
		// 1에서 100까지 출력하는 프로그램을 짜주세요.
		// 한줄에 10개 씩

		for (int x = 1; x <= 100; x++) {
			System.out.print(x + " ");
			if(x%10==0) {
				System.out.println();
			}
		}
	}

}
