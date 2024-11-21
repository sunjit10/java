package collections.maps;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/*
 * In HashMap, the order is not fixed and can vary in each cycle
 */
public class HashMapBasics {
    public static void main(String[] args) {
	example1();
	example2();
    }

    private static void example1() {
	Map<String, Object> parameters = new HashMap<>();
	parameters.put("Hi", "Hi there");
	parameters.put("Hello", null);
	parameters.put("Hola", "Hola senora");

	// This replaces the previous value for "Hi there"
	parameters.put("Hi", "Namaste");
	
	parameters.forEach((x,y) -> System.out.println("key " + x + " value " + y));
    }

    private static void example2() {
	Map<Integer, Integer> squareMap = new HashMap<>();
	for (int i = 1; i <= 10; i++) {
	    squareMap.put(i, i*i);
	}

	squareMap.forEach((k,v) -> System.out.println(k + " : " + v));

    }
}
