package lambdas.functions;

import java.util.function.Function;

/*
  Function<T,R> has a single method (Functional Interface)
  
  R apply(T t)
 */
public class PassingFunctionLikeVariable {
    public static void main(String[] args) {
	Function<Integer, Boolean> isEven = n -> (n % 2) == 0;
	getNumberInfo(isEven);
    }

    // We are accepting a Function as a parameter!
    // Essentially, we are treating functions like variables
    private static void getNumberInfo(Function<Integer, Boolean> checkIfEven) {
	System.out.println(checkIfEven.apply(20));
	System.out.println(checkIfEven.apply(21));
    }
}
