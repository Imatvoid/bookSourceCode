package chapter03.section3_1._3_1_3.waitFinishNotNotify;

public class MyThread1_2 extends Thread {
	private Object lock;

	public MyThread1_2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("MyThread12开始      wait time=" + System.currentTimeMillis());
				lock.wait();
				System.out.println("MyThread12结束      wait time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
