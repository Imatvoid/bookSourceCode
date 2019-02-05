package chapter1.section02.section_1_2_3.t4threadsafe;

public class Run {
	
	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}


}
