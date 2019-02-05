package chapter03.section3_1._3_1_3.test1;


/***
 * 测试在没有获得锁的情况下调用wait
 * 抛出java.lang.IllegalMonitorStateException 异常
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
