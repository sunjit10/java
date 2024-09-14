package jmx.mxbeans.queuesample;

public interface QueueSamplerMXBean {

    public QueueSample getQueueSample();
    
    public void clearQueue();
    
}
