package lambdas.funcinterface.basics; 

import java.util.Comparator;

public class TraditionalComparator {
    public static void main(String[] args) {
	oldWay();
	usingLambda();
    }

    private static void oldWay() {
	Comparator<Integer> comp1 = new Comparator<Integer>() {
		public int compare(Integer n1, Integer n2) {
		    return n1.compareTo(n2);
		}
	};
	
	System.out.println(comp1.compare(10,20));
	System.out.println(comp1.compare(20,10));
	System.out.println(comp1.compare(10,10));
    }

    private static void usingLambda() {
	Comparator<Integer> comp2 = (n1, n2) -> n1.compareTo(n2);

	System.out.println(comp2.compare(10,20));
	System.out.println(comp2.compare(20,10));
	System.out.println(comp2.compare(10,10));
    }
}
