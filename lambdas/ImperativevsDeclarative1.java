package lambdas;

import java.util.stream.IntStream;

// Goal: Sum of all numbers from 0 - 100 in both styles
public class ImperativevsDeclarative1 {
    public static void main(String[] args) {
	imperativeWay();
	declarativeWay();
    }

    // How style of programming
    // Code is not thread safe, very verbose, not customizable
    private static void imperativeWay() {
	int sum = 0;
	for (int i = 0; i <= 100; i++) {
	    sum += i;
	}
	System.out.println(sum);
    }

    // What style of programming
    // Code is thread safe, customizable (ex: add .parallel() in between
    private static void declarativeWay() {
	int sum = IntStream.rangeClosed(0, 100).sum();
	System.out.println(sum);
    }
}
