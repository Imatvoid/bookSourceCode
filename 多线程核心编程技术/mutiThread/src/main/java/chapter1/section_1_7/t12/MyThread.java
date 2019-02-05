package chapter1.section_1_7.t12;

public class MyThread  extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 5000; i++) {
			System.out.println("i=" + (i + 1));
		}
	}
}
