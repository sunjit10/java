package lambdas.consumer.biconsumer;

import java.util.function.BiConsumer;

// BiConsumer: public void accept(T t, U u) { } 
public class BiConsumerBasics {
    public static void main(String[] args) {
	BiConsumer<String, Integer> person = (name, age) -> System.out.println(name + " is " + age + " years old");
	person.accept("Mike", 30);
	person.accept("James", 20);

	BiConsumer<Integer, Integer> mult = (num1, num2) -> System.out.println(num1*num2);
	mult.accept(20,30);
	mult.accept(4,8);
    }
}
