package chapter1.section02.section_1_2_3.t4threadsafe;

public class LoginServlet {
	
	private static String usernameRef;
	private static String passwordRef;

	public static void doPost(String username, String password) {
	//synchronized public static void doPost(String username, String password) {
		try {
			usernameRef = username;
			if (username.equals("a")) {
				Thread.sleep(5000);
			}
			passwordRef = password;

			System.out.println("username=" + usernameRef + " password="
					+ passwordRef);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
