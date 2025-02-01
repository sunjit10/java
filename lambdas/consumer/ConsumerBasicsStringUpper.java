package lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerBasicsStringUpper {
    public static void main(String[] args) {
	Consumer<String> upperValue = (str) -> System.out.println(str.toUpperCase());
	upperValue.accept("Hello");
    }
}
