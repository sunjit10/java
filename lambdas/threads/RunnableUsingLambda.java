package lambdas.threads;

public class RunnableUsingLambda {
    public static void main(String[] args) throws InterruptedException {

	Runnable run1 = () -> {
	    for (int i = 0; i < 10; i++) {
		System.out.println(i);
	    }
	};

	Thread t1 = new Thread(run1, "Thread1");
	t1.start();
	t1.join();
	
	System.out.println("Exiting main");
    }
}
