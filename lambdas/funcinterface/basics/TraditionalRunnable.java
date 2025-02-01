package lambdas.funcinterface.basics;

public class TraditionalRunnable {
    public static void main(String[] args) {
	oldSchool();
	newWay();
    }

    private static void oldSchool() {
      	Runnable run1 = new Runnable() {
	  public void run() {
	      System.out.println(Thread.currentThread() + " running");
	  }
	};
	Thread t1 = new Thread(run1, "thread1");
	t1.start();
    }

    private static void newWay() {
	Runnable run2 = () -> System.out.println(Thread.currentThread() + " is running");
	Thread t2 = new Thread(run2, "thread2");
	t2.start();

    }
}
