package chapter1.section02.section_1_2_1.t1;

public class Run {
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("运行结束！");
	}

}
