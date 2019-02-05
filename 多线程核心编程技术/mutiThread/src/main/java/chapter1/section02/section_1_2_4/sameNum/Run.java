package chapter1.section02.section_1_2_4.sameNum;

public class Run {

    public static void main(String[] args) {

        MyThread run = new MyThread();

        Thread t1 = new Thread(run,"t5");
        Thread t2 = new Thread(run,"t4");
        Thread t3 = new Thread(run,"t3");
        Thread t4 = new Thread(run,"t2");
        Thread t5 = new Thread(run,"t1");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

