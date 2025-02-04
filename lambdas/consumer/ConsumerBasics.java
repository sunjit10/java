package lambdas.consumer;

import java.util.function.Consumer;

/*
 * Consumer<T>
 * void accept(T t);
 */
public class ConsumerBasics {
    public static void main(String[] args) {
	Consumer<String> upperValue = (str) -> System.out.println(str.toUpperCase());
	upperValue.accept("Hello");
    }
}
