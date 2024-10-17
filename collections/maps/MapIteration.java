package collections.maps;

import java.util.Map;
import java.util.HashMap;

public class MapIteration {
    public static void main(String[] args) {
	Map<String, String> days = new HashMap<>();
	days.put("MON", "Monday");
	days.put("TUE", "Tuesday");
	days.put("WED", "Wednesday");
	days.put("THUR", "Thursday");
	days.put("FRI", "Friday");
	days.put("SAT", "Saturday");
	days.put("SUN", "Sunday");
	
	days.forEach((k,v) -> System.out.println(k + " = " + v));
	
	usingEntrySetNew(days);
	usingEntrySetOld(days);
	usingKeySet(days);
	oldSchoolIterator(days);
    }

    private static void usingEntrySetNew(Map<String, String> days) {
	for (var day: days.entrySet()) {
	    System.out.println(day.getKey() + " : " + day.getValue());
	}
    }

    // Verbose, use the simpler var from above
    private static void usingEntrySetOld(Map<String, String> days) {
	for (Map.Entry<String, String> day : days.entrySet()) {
	    System.out.println(day.getKey() + " : " + day.getValue());
	}
    }

    // Not efficient, every loop have to call get
    private static void usingKeySet(Map<String, String> days) {
	for (var day: days.keySet()) {
	    System.out.println(day + " __ " + days.get(day));
	}
    }

    private static void oldSchoolIterator(Map<String, String> days) {
	var it = days.entrySet().iterator();
	while (it.hasNext()) {
	    var entry = it.next();
	    System.out.println(entry.getKey() + ".." + entry.getValue());
	}
    }
}
