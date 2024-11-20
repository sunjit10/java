package collections.sets.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetUnionAndIntersection {
    public static void main(String[] args) {
	var fruits1 = new HashSet<String>(Set.of("apple", "banana", "cherry"));
	var fruits2 = new HashSet<String>(Set.of("mango", "banana", "pineapple"));

	var union = new HashSet<String>(fruits1);
	union.addAll(fruits2);
	
	union.forEach(System.out::println);

	System.out.println();
	var intersection = new HashSet<String>(fruits1);
	intersection.retainAll(fruits2);
	
	intersection.forEach(System.out::println);
    }
}
