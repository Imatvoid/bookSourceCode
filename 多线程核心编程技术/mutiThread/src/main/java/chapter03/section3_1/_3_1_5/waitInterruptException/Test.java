package chapter03.section3_1._3_1_5.waitInterruptException;


/**
 * wait状态调用interrupt()
 * java.lang.InterruptedException
 */
public class Test {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
