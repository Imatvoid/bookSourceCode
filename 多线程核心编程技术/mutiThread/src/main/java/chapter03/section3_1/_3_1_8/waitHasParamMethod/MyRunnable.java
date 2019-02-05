package chapter03.section3_1._3_1_8.waitHasParamMethod;

public class MyRunnable {
	static private Object lock = new Object();
	static private Runnable runnable1 = new Runnable() {

		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin timer="
							+ System.currentTimeMillis());
					lock.wait(3000);
					System.out.println("wait   end timer="
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	static private Runnable runnable2 = new Runnable() {

		public void run() {
			synchronized (lock) {
				System.out.println("notify begin timer="
						+ System.currentTimeMillis());
				lock.notify();
				System.out.println("notify   end timer="
						+ System.currentTimeMillis());
			}
		}
	};


	static private Runnable runnable3 = new Runnable() {

		public void run() {
			try {
				synchronized (lock) {
					System.out.println("3 wait begin timer="
							+ System.currentTimeMillis());
					Thread.sleep(8000);
					System.out.println("3 wait   end timer="
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};


	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(runnable1);
		t1.start();

		// 占有锁 不释放
		Thread t3 = new Thread(runnable3);
		t3.start();

		Thread.sleep(8000);
		Thread t2 = new Thread(runnable2);
		t2.start();
	}

}
