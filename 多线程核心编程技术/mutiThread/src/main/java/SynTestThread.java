public class SynTestThread implements Runnable {


    public synchronized static  void printA(){


          try {
              System.out.println(Thread.currentThread().getName()+" in  printA");
              Thread.sleep(3000);
              System.out.println(Thread.currentThread().getName()+" out printA");
          }catch (InterruptedException e ){

          }

    }

    public synchronized   void printB(){
        try {
            System.out.println(Thread.currentThread().getName()+" in printB");

            System.out.println(Thread.currentThread().getName()+" out printB");
        }catch (Exception e ){

        }
    }



    public void run() {
        if(Thread.currentThread().getName().equals("Thread-0")) {
            printA();
            printB();
        }else{
            printB();
            printA();
        }

    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new SynTestThread());
        Thread t2 = new Thread(new SynTestThread());
        t1.start();
        t2.start();

    }
}
