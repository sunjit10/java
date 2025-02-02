package lambdas.functions;

import java.util.function.Function;

/*
  Function<T,R> has a single method (Functional Interface)
  
  R apply(T t)
 */
public class FunctionChaining {
    public static void main(String[] args) {
	Function<Integer, Integer> doubleIt = n -> n * 2;
	Function<Integer, Integer> tripleIt = n -> n * 3;

	System.out.println(doubleIt.andThen(tripleIt).apply(10));

	mathWizardy(doubleIt, tripleIt);
    }

    // Passing Functions as Parameters
    private static void mathWizardy(Function<Integer, Integer> doubleIt,
				    Function<Integer, Integer> tripleIt) {

	System.out.println(doubleIt.apply(10));
	System.out.println(tripleIt.apply(50));
    }
}
