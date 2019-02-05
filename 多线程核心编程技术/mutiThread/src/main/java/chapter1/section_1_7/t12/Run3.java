package chapter1.section_1_7.t12;

public class Run3 {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(10);
			thread.interrupt();

			//这里如果你的机器跑的很快，到这里已经运行完，那个会输出两个false，因为线程已经死掉了。
			System.out.println("是否停止1？="+thread.isInterrupted());
			System.out.println("是否停止2？="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
