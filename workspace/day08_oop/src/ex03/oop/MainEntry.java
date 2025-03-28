package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV("red");
		TV tv3 = new TV(7);
		TV tv4 = new TV("blue", 11);

		tv1.display();
		System.out.println("------------------");
		tv2.display();
		System.out.println("------------------");
		tv3.display();
		System.out.println("------------------");
		tv4.display();
	}

}
