package java8;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
	oldSchoolExceptionFinally();
	usingTryWithResources();
    }

    private static void oldSchoolExceptionFinally() {
	Scanner scanner = null;
	try {
	    scanner = new Scanner(new File("java8/input.txt"));
	    while (scanner.hasNext()) {
		System.out.println("Read line " + scanner.nextLine());
	    }
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} finally {
	    if (scanner != null) {
		System.out.println("Closing scanner ");
		scanner.close();
	    }
	}
    }

    // Only works because Scanner implements AutoCloseable
    private static void usingTryWithResources() {
	try (Scanner scanner = new Scanner(new File("java8/input.txt"))) {
	    while (scanner.hasNext()) {
		System.out.println("Read line " + scanner.nextLine());
	    }
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} 
    }
    
}
