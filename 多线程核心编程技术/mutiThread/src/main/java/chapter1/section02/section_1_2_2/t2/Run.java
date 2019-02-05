package chapter1.section02.section_1_2_2.t2;

public class Run {
	
	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("运行结束!");
	}

}
