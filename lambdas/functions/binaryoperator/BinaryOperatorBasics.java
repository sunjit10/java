package lambdas.functions.binaryoperator;

import java.util.function.BinaryOperator;

/*
 BinaryOperator is an extension of BiFunction
 BinaryOperator<T,T,T>     
 public void T apply(T, T)
 */
public class BinaryOperatorBasics {
    public static void main(String[] args) {
	    BinaryOperator<String> bStr = (s1, s2) -> s1.concat(s2);
        System.out.println(bStr.apply("hello", "world"));

        BinaryOperator<Integer> bIntSum = (n1, n2) -> n1 + n2;
        System.out.println(bIntSum.apply(20,30));
    }
}
