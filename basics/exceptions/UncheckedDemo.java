package basics.exceptions;

import java.util.Scanner;

/*
 * When you input a non numeric value, it throws NumberFormatException
 * which is an Unchecked Exception
 */
public class UncheckedDemo {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	handlingUncheckedException(scanner);
	showUncheckedException(scanner);
	
	scanner.close();
    }
    
    
    private static void handlingUncheckedException(Scanner scanner) {
	System.out.println("Enter a garbled non-number > ");
	String inp = scanner.nextLine();
	int numVal;
	try {
	    numVal = Integer.parseInt(inp);
	} catch (NumberFormatException e) {
	    System.out.println("Try again, the earlier entry was not a number");
	    inp = scanner.nextLine();
	    numVal = Integer.parseInt(inp);
	}
	System.out.println("You entered " + numVal);
    }
	
    private static void showUncheckedException(Scanner scanner) {
	System.out.println("Enter a garbled non-number > ");
	String inp = scanner.nextLine();
	int numVal = Integer.parseInt(inp);
	System.out.println("You entered " + numVal);
    }
    
}
