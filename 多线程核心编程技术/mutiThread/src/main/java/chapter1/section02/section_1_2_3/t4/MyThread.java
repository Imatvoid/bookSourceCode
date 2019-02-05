package chapter1.section02.section_1_2_3.t4;

public class MyThread extends Thread {

	private int count=5;
	
	@Override
	public void run() {
	//synchronized public void run() {
		super.run();
			count--;
			System.out.println("由 "+this.currentThread().getName()+" 计算，count="+count);
	}
}
