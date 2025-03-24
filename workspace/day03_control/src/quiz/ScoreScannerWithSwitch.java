package quiz;

import java.util.Scanner;

public class ScoreScannerWithSwitch {
	public static void main(String[] args) {
		// kor, eng, com, name -> 총점tot, 평균avg 구하는 프로그램 작성
		// 평균 60점 이상, 과목 당 40점 이상 이어야 합격입니다.

		Scanner sc = new Scanner(System.in);

		// 1.변수 선언
		int kor, eng, com, tot;
		String name;
		double avg = 0.0;
		char grade = ' ';

		// 2. 메시지 출력 및 입력
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); // next() vs nextLine()

		System.out.print("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();

		System.out.print("영어 성적을 입력하세요 : ");
		eng = sc.nextInt();

		System.out.print("전산 성적을 입력하세요 : ");
		com = sc.nextInt();

		// 3. 계산(처리)
		tot = kor + eng + com;
		avg = tot / 3;

		// 4. 결과 출력
		switch ((int) avg / 10) { // (tot/30)
		case 10:
		case 9: {
			grade = 'A';
			break;
		}
		case 8: {
			grade = 'B';
			break;
		}
		case 7: {
			grade = 'C';
			break;
		}
		case 6: {
			grade = 'D';
			break;
		}

		default:
			grade = 'F';
			break;

		}

		System.out.println(name + "의 평균 " + avg + "점 ======> " + grade + "학점");

	}
}