package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GeneratingStreamFromTextFile {
    public static void main(String[] args) throws IOException {

	// Make sure path is correct
	Files.lines(Paths.get("/home/sunjit/dev/java/streams/blah.txt"))
	    .forEach(System.out::println);
	
    }
}
