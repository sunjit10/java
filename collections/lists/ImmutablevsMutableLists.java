package collections.lists;

import java.util.List;
import java.util.ArrayList;

public class ImmutablevsMutableLists {
    public static void main(String[] args) {
	immutableList();
	mutableList();
    }

    private static void immutableList() {
	var numbers = List.of(3,5,4,7,6,1,2,8);
	// This will show that numbers is an ImmutableList
	System.out.println(numbers.getClass());

	// Cannot add or remove since this is an ImmutableList
	//numbers.add(9);
	numbers.forEach(System.out::println);
    }

    private static void mutableList() {
	System.out.println("\nMutable List \n");
	var numbers = new ArrayList<>(List.of(3,5,4,7,6,1,2));
	System.out.println(numbers.getClass());
	// Can do it since it is a mutableList
	numbers.add(9); numbers.remove(0);
	numbers.forEach(System.out::println);
    }
}
