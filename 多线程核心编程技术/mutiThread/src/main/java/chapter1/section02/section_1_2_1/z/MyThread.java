package chapter1.section02.section_1_2_1.z;

public class MyThread extends Thread{
	
	private int i;

	public MyThread(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i);
	}
	
}
