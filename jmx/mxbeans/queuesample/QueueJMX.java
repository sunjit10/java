package jmx.mxbeans.queuesample;

import java.lang.management.ManagementFactory; 
import java.util.Queue; 
import java.util.concurrent.ArrayBlockingQueue; 
import javax.management.MBeanServer; 
import javax.management.ObjectName;


public class QueueJMX {
    public static void main(String args[]) throws Exception {
	MBeanServer mbs = 
            ManagementFactory.getPlatformMBeanServer(); 
	
        
        ObjectName mxbeanName = new ObjectName("jmx.mxbeans.queuesample:type=QueueSampler");
        
        Queue<String> queue = new ArrayBlockingQueue<String>(10);
        queue.add("Request-1");
        queue.add("Request-2");
        queue.add("Request-3");

	QueueSampler mxbean = new QueueSampler(queue);
        
        mbs.registerMBean(mxbean, mxbeanName);
                 
        System.out.println("Waiting..."); 
        Thread.sleep(Long.MAX_VALUE); 

    }
}
