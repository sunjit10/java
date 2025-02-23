package streams.basics;

import java.util.stream.Stream;

// Goal:
// 1. Generate a Stream of Strings (Ocean names)
// 2. Sort them alphabetically and print them
public class Streamof {
    public static void main(String[] args) {
	Stream<String> stringStream = Stream.of("Atlantic", "Pacific", "Artic", "Indian");
        stringStream.sorted().forEach(System.out::println);
    }
}
