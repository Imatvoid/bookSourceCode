package chapter03.section3_1._3_1_4.notifyHoldLock;

public class synNotifyMethodThread extends Thread {
	private Object lock;

	public synNotifyMethodThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);
	}

}
