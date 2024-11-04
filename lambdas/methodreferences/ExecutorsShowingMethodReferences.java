package lambdas.methodreferences;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class ExecutorsShowingMethodReferences {

    private static void greet() {
	System.out.println("Hello from Thread " + Thread.currentThread());
    }

    
    public static void main(String[] args) {
	var service = Executors.newScheduledThreadPool(3);

	// The first parameter should be Runnable
	service.scheduleAtFixedRate(ExecutorsShowingMethodReferences::greet,
				    0, 200, TimeUnit.MILLISECONDS);
    }
}
