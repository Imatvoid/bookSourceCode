package chapter03.section3_1._3_1_14.project_1_wait_notify_insert_test;

public class BackupB extends Thread {

	private DBTools dbtools;

	public BackupB(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}

	@Override
	public void run() {
		dbtools.backupB();
	}

}
