package ex04.array;

public class QuizEx1 {
	public static void main(String[] args) {
		// 배열 여러개 데이터 중에서 7의 개수를 찾기
		int[] a = new int[] { 7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 }; // 선언과 동시에 초기화

		int cnt = 0;
		for (int x = 0; x < a.length; x++) {
			if (a[x] == 7)
				cnt++;
		}

		System.out.println("7의 개수는 " + cnt + "개");
	}

}
