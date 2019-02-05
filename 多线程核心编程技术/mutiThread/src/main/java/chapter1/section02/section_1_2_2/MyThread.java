package chapter1.section02.section_1_2_2;

public class MyThread  extends  Thread{


    @Override
    public void run() {
       // super.run();

        System.out.println("1");

    }

    public static void main(String[] args) {
       // new MyThread().start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("Run of  Runnable");
            }
        }) {
            public void run() {
                System.out.println("Run of Thread");
            }
        }.start();
    }
}
