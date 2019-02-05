package chapter03.section3_1._3_1_3.test2;


/***
 * 测试wati和notify组合使用
 */
public class Test {
	public static void main(String[] args) {
		try {
			Object lock = new Object();

			MyThread1 t1 = new MyThread1(lock);
			t1.start();

			Thread.sleep(3000);

			MyThread2 t2 = new MyThread2(lock);
			t2.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
