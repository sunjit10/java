package collections.sets;

import java.util.LinkedHashSet;

/*
 * In LinkedHashSet, order is maintained
 * Inside, objects are stored in a Hashtable and hence search (using contains) is fast
 */
public class LinkedHashSetBasics {
    public static void main(String[] args) {
	LinkedHashSet<String> lhs = new LinkedHashSet<>();
	lhs.add("apple");
	lhs.add("pear");
	lhs.add("cherry");
	lhs.add("banana");
	
	lhs.forEach(System.out::println);

	// Searching is fast in HashSet
	System.out.println(lhs.contains("cherry"));
    }
}
