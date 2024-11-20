package collections.maps;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/*
 * In HashMap, the order is not fixed and can vary in each cycle
 */
public class HashMapBasics {
    public static void main(String[] args) {
	Map<String, Object> parameters = new HashMap<>();
	parameters.put("Hi", "Hi there");
	parameters.put("Hello", null);
	parameters.put("Hola", "Hola senora");
	parameters.put("Hi", "Namaste");
	
	parameters.forEach((x,y) -> System.out.println("key " + x + " value " + y));
	
    }
}
