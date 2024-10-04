package collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListOfNumbers {

    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);

	iterateList1(list);
	iterateList2(list);
	iterateList3(list);
	getTwiceOfValues(list);
    }

    private static void iterateList1(List<Integer> list) {
	for (Integer i : list) {
	    System.out.println(i);
	}
    }

    private static void iterateList2(List<Integer> list) {
	Iterator<Integer> it = list.iterator();
	while (it.hasNext()) {
	    System.out.println(it.next());
	}
    }

    private static void iterateList3(List<Integer> list) {
	list.forEach(System.out::println);
    }

    private static void getTwiceOfValues(List<Integer> list) {
	list.forEach(e -> {
		System.out.println(e*2);
	    });
    }
}
