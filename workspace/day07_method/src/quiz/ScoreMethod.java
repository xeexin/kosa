package quiz;

import java.util.Scanner;

//문제] 성적처리 프로그램을 함수로 분리한다.
//입력함수 input() - 이름, 국어,영어,전산 점수
//출력함수 output()
//총점_평균 구하는 함수 total_avg(~~~~ )
//학점 구하는 함수 grade(~~~)
//메인함수 

public class ScoreMethod {

	public static void input() {
		String name = null;
		int kor, eng, com;
		Scanner score_in = new Scanner(System.in);
		System.out.print("Enter your name : ");
		Scanner name_in = new Scanner(System.in);
		name = name_in.nextLine();
		System.out.print("Enter your Korean score : ");
		kor = score_in.nextInt();
		System.out.print("Enter your English score : ");
		eng = score_in.nextInt();
		System.out.print("Enter your Computer score : ");
		com = score_in.nextInt();
		System.out.println("\n\n");
		System.out.println(name + "님의 성적표....");
		System.out.println("kor : " + kor + ", eng: " + eng + ", com: " + com);

		total_cal(kor, eng, com);

	} // input end

	public static void total_cal(int kor, int eng, int com) {
		int total = 0;
		total = kor + eng + com;
		System.out.println("Your total score : " + total);

		avg_cal(total);

	} // total_cal end

	public static void avg_cal(int total) {
		double avg = 0.0;
		avg = (double) total / 3;
		System.out.println("Your average : " + avg);

		grade_cal(avg);
	} // avg_cal end

	public static void grade_cal(double avg) {
		int avg_tmp = 0;
		avg_tmp = (int) avg / 10;

		char grade = ' ';

		switch (avg_tmp) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("Your grade : " + grade);
	}// grade_cal end

	public static void main(String[] args) {
		input();
	}
}
