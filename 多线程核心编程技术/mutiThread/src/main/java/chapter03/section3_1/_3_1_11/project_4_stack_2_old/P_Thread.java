package chapter03.section3_1._3_1_11.project_4_stack_2_old;

public class P_Thread extends Thread {

	private P p;

	public P_Thread(P p) {
		super();
		this.p = p;
		this.setName("production Thread");
	}

	@Override
	public void run() {
		while (true) {
			p.pushService();
		}
	}

}
