package chapter1.section02.section_1_2_3.t4threadsafe;

public class ALogin extends Thread {
	
	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}

