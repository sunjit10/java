package lambdas.functions;

import java.util.function.UnaryOperator;

/*
 UnaryOperator is an extension of Function where it accepts
 one Input parameter and outputs one parameter OF THE SAME TYPE
 */
public class UnaryOperatorBasics {
    public static void main(String[] args) {
	UnaryOperator<String> smithFamily = s -> s +  " Smith";
	
	System.out.println("Full Name: " + smithFamily.apply("Mike"));
	System.out.println("Full Name: " + smithFamily.apply("Jim"));
	
	UnaryOperator<Integer> squared = n -> n*n;
	System.out.println(squared.apply(3));
	System.out.println(squared.apply(4));
    }
}
