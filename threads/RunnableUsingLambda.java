package threads;

public class RunnableUsingLambda {
    public static void main(String[] args) throws InterruptedException {

	Runnable run1 = () -> {
	    for (int i = 0; i < 10; i++) {
		System.out.println(Thread.currentThread().getName() + " : " + i);
	    }
	    System.out.println("Exiting " + Thread.currentThread());
	};

	Thread t1 = new Thread(run1, "Thread1");
	t1.start();

	Thread t2 = new Thread(run1, "Thread2");
	t2.start();

	// TBD: Try commenting out the join() methods to see how behavior changes
	
	//t1.join();
	//t2.join();
	System.out.println("Exiting main");
	
    }
}
