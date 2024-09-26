package basics.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestOnlyFinally {
    public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = null;
	try {
	    // File throws FileNotFoundException but I am not catching it
	    scanner = new Scanner(new File("javsa8/input.txt"));
	    while (scanner.hasNext()) {
		System.out.println("Read line " + scanner.nextLine());
	    }
	} finally {
	    System.out.println("Closing scanner ");
	    if (scanner != null) {
		scanner.close();
	    }
	}
    }
}
