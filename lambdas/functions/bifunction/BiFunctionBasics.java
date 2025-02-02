package lambdas.functions.bifunction;

import java.util.function.BiFunction;

/*
  BiFunction<T, U, R>     R apply(T t, U u)
*/
public class BiFunctionBasics {
    public static void main(String[] args) {
	BiFunction<String, String, Integer> totalStrLen =  (fname, lname) -> fname.concat(lname).length();
	System.out.println(totalStrLen.apply("John", "Doe"));
    }
}
