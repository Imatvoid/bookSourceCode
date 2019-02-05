package chapter1.section_1_7_4.t15;

public class Run {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		thread.interrupt();
		System.out.println("end!");
	}

}
