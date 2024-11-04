package lambdas.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesArrayList {
    public static void main(String[] args) {
	var numbers = new ArrayList<>(List.of(1,6,4,7,3,8,2));
 
	// Traditional way of doing it
	//numbers.removeIf(n -> n < 5);
	//numbers.replaceAll(n -> n * 2);
	//numbers.forEach(System.out::println);

	// Simulate the same using MethodReferences
	numbers.removeIf(MethodReferencesArrayList::isNumberGreaterThanFive);
	numbers.replaceAll(MethodReferencesArrayList::doubleTheValues);
	numbers.forEach(MethodReferencesArrayList::print);
    }

    private static boolean isNumberGreaterThanFive(int n) {
	return n < 5;
    }
    
    private static int doubleTheValues(int n) {
	return n*2;
    }

    private static void print(int n) {
	System.out.println("List value: " + n);
    }
}
