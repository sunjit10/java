package streams.collectors;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

// Using streams, list all words in a file
public class ListAllWordsInFile {
    public static void main(String[] args) throws IOException {
	List<String> myList =
	    Files.lines(Paths.get("/home/rishma/dev/java/streams/blah.txt"))
	    .map(s -> s.split("^a-zA-Z"))
	    .map(a -> Arrays.asList(a))
	    .flatMap(l -> l.stream())
	    .collect(Collectors.toList());
	
	for (String item : myList) {
	    System.out.println(item);
	}
    }
}
