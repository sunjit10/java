package streams.basics;

import java.util.stream.Stream;

public class Streamof {
    public static void main(String[] args) {
	Stream<String> stringStream = Stream.of("Atlantic", "Pacific", "Artic", "Indian");
	stringStream.sorted().forEach(System.out::println);
    }
}
