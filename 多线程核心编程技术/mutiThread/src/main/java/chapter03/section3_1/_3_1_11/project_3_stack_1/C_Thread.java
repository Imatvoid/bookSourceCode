package chapter03.section3_1._3_1_11.project_3_stack_1;

public class C_Thread extends Thread {

	private C r;

	public C_Thread(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.popService();
		}
	}

}
