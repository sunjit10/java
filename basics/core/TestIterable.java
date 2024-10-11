package basics.core;

import java.util.Arrays;
import java.util.Iterator;

class Flowers implements Iterable<String> {

    String[] flowers = {"rose", "daffodil", "sunflower", "daisy", "lotus"};
    
    public Iterator<String> iterator() {
	return Arrays.asList(flowers).iterator();
    }

}


public class TestIterable {
    public static void main(String[] args) {
	Flowers someCoolFlowers = new Flowers();
	for (String f : someCoolFlowers) {
	    System.out.println(f);
	}
    }
}
