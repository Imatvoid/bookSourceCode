package chapter1.section02.section_1_2_2;

public class Threader {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating & starting new Thread");
        Thread t0 = new Thread();
        t0.start();
        t0.join();

        System.out.println("Creating & starting new Thread, with MyRun");
        Thread t1 = new Thread(new MyRun());
        t1.start();
        t1.join();

        System.out.println("Creating & starting new MyThread");
        MyThread t2 = new MyThread();
        t2.start();
        t2.join();

        System.out.println("Creating & starting new MyThread, with MyRun");
        MyThread t3 = new MyThread(new MyRun());
        t3.start();
    }



     static class MyThread extends Thread {
        public MyThread() {
            super();
        }

        public MyThread(Runnable runner) {
            super(runner);
        }

        @Override
        public void run() {
            super.run();
            System.out.println("MyThread.run()");

            for (int i = 0; i < 3 ;i++)  {
                System.out.print(i);
                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }

    static class MyRun implements Runnable {
        public void run() {
            System.out.println("MyRun.run()... Sleeping");
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Woke up");
        }
    }
}

