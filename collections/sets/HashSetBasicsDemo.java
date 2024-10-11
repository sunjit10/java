package collections.sets;

import java.util.HashSet;

/*
 *   4 Unique characteristics of HashSets
 *
 *   - Cannot store duplicates
 *   - Order in which objects are stored is random 
 *   - Fast for search since it does not have duplicates
 *   - add method returns false if you try to add a duplicate, else returns true
 *    
 */
public class HashSetBasicsDemo {
    public static void main(String[] args) {
	HashSet<String> fruits = new HashSet<>();
	
	addElementsIncludingDuplicates(fruits);
	
	for (var fruit : fruits) {
	    System.out.println(fruit);
	}
    }
    
    private static void addElementsIncludingDuplicates(HashSet<String> fruits) {
	fruits.add("apple");
	fruits.add("banana");
	fruits.add("banana");
	fruits.add("orange");
    }
}
