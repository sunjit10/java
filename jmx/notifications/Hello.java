package jmx.notifications;

import javax.management.*;

public class Hello
    extends NotificationBroadcasterSupport
    implements HelloMBean {

    private static final int DEFAULT_CACHE_SIZE = 200;
    private final String name = "Reginald";
    private int cacheSize = DEFAULT_CACHE_SIZE;
    private long sequenceNumber = 1;

    @Override
    public void sayHello() {
	System.out.println("Hello World");
    }

    @Override
    public int add(int x, int y) {
	return x + y;
    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public int getCacheSize() {
	return cacheSize;
    }

    @Override
    public void setCacheSize(int size) {
	int oldSize = this.cacheSize;
        this.cacheSize = size;

        System.out.println("Cache size now " + this.cacheSize);
	
        Notification n =
	    new AttributeChangeNotification(this,
					    sequenceNumber++, System.currentTimeMillis(),
					    "CacheSize changed", "CacheSize", "int",
					    oldSize, this.cacheSize);
	
        sendNotification(n);
    }

    @Override
    public MBeanNotificationInfo[] getNotificationInfo() {
        String[] types = new String[]{
            AttributeChangeNotification.ATTRIBUTE_CHANGE
        };
	
        String name = AttributeChangeNotification.class.getName();
        String description = "An attribute of this MBean has changed";
        MBeanNotificationInfo info = 
	    new MBeanNotificationInfo(types, name, description);
        return new MBeanNotificationInfo[]{info};
    }
}
