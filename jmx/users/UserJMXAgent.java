package jmx.users;

import java.lang.management.*; 
import javax.management.*;

/*
java -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=8008 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false jmx.users.UserJMXAgent
*/
public class UserJMXAgent {
    public static void main(String[] args) throws Exception {
	MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();

	ObjectName name = new ObjectName("test:type=User");
	User userMBean = new User();
	mBeanServer.registerMBean(userMBean, name);
	Thread.sleep(Long.MAX_VALUE);
    }
}


