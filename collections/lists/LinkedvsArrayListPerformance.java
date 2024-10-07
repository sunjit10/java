package collections.lists;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedvsArrayListPerformance {
    public static void main(String[] args) {
	listPerformance(new LinkedList<Integer>());
	listPerformance(new ArrayList<Integer>());
    }

    /*
     * ArrayList are way slower if adding at the first element since for each call
     * all elements needs to be shifted. LinkedList perform much better in this case
     */
    private static void listPerformance(List<Integer> list) {
	long startTime = System.currentTimeMillis();
	for (int i = 0; i < 1E5; i++) {
	    list.add(0, i);
	}
	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("Total Time for " + list.getClass() +  " is  " + totalTime);
    }
}
