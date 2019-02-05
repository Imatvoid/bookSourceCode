package chapter03.section3_1._3_1_11.project_4_stack_2_old;

public class C {

	private MyStack myStack;

	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void popService() {
		//System.out.println("pop=" + myStack.pop());
		myStack.pop();
	}
}
