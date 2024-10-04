package collections.lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingNumberLists {
    public static void main(String[] args) {
	List<Double> temps = new ArrayList<Double>();
	temps.add(83.1);
	temps.add(87.1);
	temps.add(67.9);
	temps.add(66.1);
	temps.add(85.5);

	sortAscending(temps);
    }
    
    private static void sortAscending(List<Double> temps) {
	Collections.sort(temps);
	temps.forEach(System.out::println);
    }
}
