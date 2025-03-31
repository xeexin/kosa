package ex01.oop;

public class Point {
	private int x, y;

	// 생성자 함수 3개
	public Point() {
		this(100, 100); //인자값 두개짜리 생성자 함수 호출, 따라서 해당 생성자 함수가 있어야 함.

		System.out.println("default constructor");

	}

	public Point(int x, int y) {
		System.out.println("2 constructor");

		this.x = x;
		this.y = y;

	}

	public Point(int yy) {
		System.out.println("1 constructor");
		x = 1000;
		y = yy;

	}

	// output method
	public void disp() {
		System.out.println(x + " , " + y);

	}

}
