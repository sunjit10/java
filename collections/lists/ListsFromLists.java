package collections.lists;

import java.util.List;
import java.util.ArrayList;

/*
 * Different ways to initialize list from another list
 */
public class ListsFromLists {
    public static void main(String[] args) {
	List<String> list1 = new ArrayList<>(List.of("mango", "guava", "apple", "cherry"));
	displayList(list1);
	
	List<String> list2 = new ArrayList<>();
	list2.addAll(list1);
	displayList(list2);

	List<String> list3 = new ArrayList<>(list1);
	displayList(list3);
    }

    private static void displayList(List list) {
	System.out.println("\nPrinting list ");
	for (var n : list) {
	    System.out.println(n);
	}
    }
}
