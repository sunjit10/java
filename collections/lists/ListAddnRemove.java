package collections.lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListAddnRemove {
    public static void main(String[] args) {
	List<Integer> numberList = new ArrayList<>(List.of(20,30,40));
	numberList.add(0, 10);
	numberList.add(2, 25);
	numberList.forEach(System.out::println);

	System.out.println("\nAfter remove");
	numberList.remove(1);
	numberList.forEach(System.out::println);
	
	// This will throw a ConcurrentModificationException
	//unAllowedRemoval(numberList);

	allowedRemoval(numberList);
	numberList.forEach(System.out::println);
    }

    private static void unAllowedRemoval(List<Integer> numberList) {
	for (Integer i : numberList) {
	    if (i == 40) {
		numberList.remove(i);
	    }
	}
    }

    private static void allowedRemoval(List<Integer> numberList) {
	Iterator<Integer> it = numberList.iterator();
	while (it.hasNext()) {
	    Integer i = it.next();
	    if (i == 40) {
		it.remove();
	    }
	}
    }
}
