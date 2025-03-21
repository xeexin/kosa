//*
package quiz;

import java.util.Scanner;

public class ScoreScanner {
	public static void main(String[] args) {
		// kor, eng, com, name -> 총점tot, 평균avg 구하는 프로그램 작성

		Scanner sc = new Scanner(System.in);

		int kor, eng, com, tot;
		String name;

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();

		System.out.print("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();

		System.out.print("영어 성적을 입력하세요 : ");
		eng = sc.nextInt();

		System.out.print("컴퓨터 성적을 입력하세요 : ");
		com = sc.nextInt();

		double avg;

		tot = kor + eng + com;
		avg = tot / 3;

		System.out.println("[" + name + "님의 성적]");
		System.out.println("국어 : " + kor + "\t영어 : " + eng + "\t컴퓨터 : " + com + "\n총점 : " + tot);
		System.out.printf("평균 : %.2f ", avg);
	}
}

//*/