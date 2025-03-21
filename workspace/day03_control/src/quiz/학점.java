package quiz;

import java.util.Scanner;

public class 학점 {
	public static void main(String[] args) {
		
		System.out.print("점수 입력 : ");
		
		int score = new Scanner(System.in).nextInt();

		if (score >= 90)
			System.out.println("학점 : A");
		else if (score >= 80)
			System.out.println("학점 : B");
		else if (score >= 70)
			System.out.println("학점 : C");
		else if (score >= 60)
			System.out.println("학점 : D");
		else
			System.out.println("학점 : F");
	}
}
