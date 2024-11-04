package threads;

public class IncrementingWithUnexpectedOutput {

    private static  int value = 0;
    
     public static void main(String[] args) throws InterruptedException {

	Runnable run1 = () -> {
	    for (int i = 0; i < 10_000; i++) {
		value++;
	    }
	    System.out.println("Exiting " + Thread.currentThread());
	};
	
	Thread t1 = new Thread(run1, "Thread1");
	t1.start();
	
	Thread t2 = new Thread(run1, "Thread2");
	t2.start();
	
	t1.join();
	t2.join();

	// You would think this will be 20000 but it is always a random number between 10K and 20K. Why?
	System.out.println("Exiting main: value " + value);
	
     }
    
}
