package ex03.default_constructor;

/**
 * @author heejin
 * @param args 메인은 아무 값도 넘겨 받지 않습니다.
 * @param x    곱을 구하는 것에 첫번째 정수형 변수
 * @param y    곱을 구하는 것에 두번째 정수형 변수
 * @param gob  x와 y의 두 정수의 곱을 저장하는 변수
 */

public class MainEntry {
	public static void main(String[] args) {

		int x, y, gop = 1;
		char ch = 'A';
		String msg;

		x = 5;
		y = 10;
		msg="th2 MSA HELLO~~";
		
		gop=gop(x,y);
		
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x+" * "+ y +" = " + gop);

	}
	
	public static int gop(int x, int y) {
		return x*y;
	}

}

