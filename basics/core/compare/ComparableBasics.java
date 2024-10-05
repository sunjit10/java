package basics.core;

import java.util.Scanner;

/*
   Demonstrates the built in Comparable Interface and its compareTo method
   It returns a -ive or +ive value depending on what gets compared
   It can also return 0 if both values are exactly the same
 */
public class ComparableBasics {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter String 1");
	String str1 = scanner.nextLine();

	System.out.println("Enter String 2");
	String str2 = scanner.nextLine();
	scanner.close();
	
	//String str1 = "abc";
	//String str2 = "xyz";
	
	int comparison1 = str1.compareTo(str2);
	System.out.println(str1 + " compared to " + str2);
	System.out.println(comparison1);

	System.out.println(str2 + " compared to " + str1);
	int comparison2 = str2.compareTo(str1);
	System.out.println(comparison2);
    }
}
