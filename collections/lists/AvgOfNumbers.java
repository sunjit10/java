package collections.lists;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
      User enters a number one after the other, keep accepting till user types "stop"
      If user enters something that is not a number, ignore it and keep asking
      For all the numbers, display them sorted in ascending order and also their average      
 */

public class AvgOfNumbers {

    private static List<Integer> list = new ArrayList<>();
    
    public static void main(String[] args) {
	System.out.println("Input integer numbers, enter stop to exit");
	populateList();
	
	// Sorted in Ascending
	System.out.println("List in Ascending order ->");
	Collections.sort(list);
	list.forEach(System.out::println);

	printSumAndAvg();
    }


    private static void populateList() {
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	
	while (!input.equals("stop")) {
	    try {
		int val = Integer.valueOf(input);
		list.add(val);
	    } catch (NumberFormatException e) {
		System.out.println("Invalid entry, Enter number only");
	    }
	    System.out.println("Enter next number");
	    input = scanner.nextLine();
	}
	scanner.close();
    }
    
    
    private static void printSumAndAvg() {
	int sum = 0;
	Iterator<Integer> it = list.iterator();
	while (it.hasNext()) {
	    sum += it.next();
	}
	
	System.out.println("Sum is " + sum);
	System.out.println("Average is " + Double.valueOf(sum).doubleValue()/list.size());
    }
}
 
