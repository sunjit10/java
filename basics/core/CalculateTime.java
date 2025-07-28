package basics.core;

public class CalculateTime {
    public static void main(String[] args) {
	//System.out.println(calculateUptime(12));
	//System.out.println(calculateUptime(1200));
	System.out.println(calculateUptime(3600));
	//System.out.println(calculateUptime(50500));
	//System.out.println(calculateUptime(183600));
    }

    public static String calculateUptime(long uptime) {
	
	long days = uptime / 86400;
	long hours = (uptime % 86400) / 3600;
	long minutes = (uptime % 3600) / 60;
	long seconds = uptime % 60;
	
	if (days > 0) {
	    return days == 1 ? days + " Day" : days + " Days";
	} else if (hours > 0) {
	    return hours == 1 ? hours + " Hour" : hours + " Hours";
	} else if (minutes > 0) {
	    return minutes == 1 ? minutes + " Minute" : minutes + " Minutes";
	} else {
	    return seconds == 1 ? seconds + " Second" : seconds + " Seconds";
	}
    }

}
