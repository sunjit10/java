package java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TryWithResourcesDemo2 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
	try (BufferedReader br = new BufferedReader(new FileReader("/home/rishma/dev/java/java8/input.txt"))) {
	    String currentLine = null;
	    while ((currentLine = br.readLine()) != null) {
		System.out.println(currentLine);
	    }
	}
    }
}
