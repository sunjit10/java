package lambdas.consumer.biconsumer;

import java.util.function.BiConsumer;

// BiConsumer1.andThen(BiConsumer2)
// BiConsumer1.andThen(BiConsumer2).andThen(BiConsumer3).....x
public class BiConsumerChaining {
    public static void main(String[] args) {
	BiConsumer<Integer, Integer> add = (num1, num2) -> System.out.println(num1 + num2);
	BiConsumer<Integer, Integer> avg = (num1, num2) -> System.out.println(num1/num2);
	BiConsumer<Integer, Integer> mult = (num1, num2) -> System.out.println(num1 * num2);

	add.andThen(avg).andThen(mult).accept(100,2);
    }
}
