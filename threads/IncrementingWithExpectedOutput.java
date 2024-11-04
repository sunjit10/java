package threads;

public class IncrementingWithExpectedOutput {
    
    private static int value = 0;
    private static Object myObject = new Object();
    
    public static void main(String[] args) throws InterruptedException {
	
	Runnable run1 = () -> {
	    for (int i = 0; i < 10_000; i++) {
		synchronized(myObject) {
		    value++;
		}
	    }
	    System.out.println("Exiting " + Thread.currentThread());
	};
	
	Thread t1 = new Thread(run1, "Thread1");
	t1.start();
	
	Thread t2 = new Thread(run1, "Thread2");
	t2.start();
	
	t1.join();
	t2.join();
	
	// synchronized solves it. Now it will always be 20K
	System.out.println("Exiting main: value " + value);
	
    }
    
}
