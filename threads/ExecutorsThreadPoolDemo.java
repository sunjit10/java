package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsThreadPoolDemo {
    public static void main(String[] args) {

	var service = Executors.newScheduledThreadPool(3);

	service.scheduleAtFixedRate(() -> {

		System.out.println("Hello from " + Thread.currentThread());

	    }, 0, 100, TimeUnit.MILLISECONDS);
    }
}
