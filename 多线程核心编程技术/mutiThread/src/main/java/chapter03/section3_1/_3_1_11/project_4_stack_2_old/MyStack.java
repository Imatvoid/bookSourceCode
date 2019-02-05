package chapter03.section3_1._3_1_11.project_4_stack_2_old;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List list = new ArrayList();

	synchronized public void push() {
		try {
			while (list.size() == 1) {
				System.out.println("push操作中的："
						+ Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
				System.out.println(Thread.currentThread().getName() + " push 接到通知");
			}
			list.add("anyString=" + Math.random());
			System.out.println("push操作中的："
					+ Thread.currentThread().getName() + "通知");
			this.notifyAll();
			System.out.println(Thread.currentThread().getName()+" push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public String pop() {
		String returnValue = "";
		try {
			while (list.size() == 0) {
				System.out.println("pop操作中的："
						+ Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
				System.out.println(Thread.currentThread().getName() + " pop 接到通知");
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println(Thread.currentThread().getName() + " pop=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
