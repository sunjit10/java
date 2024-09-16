package basics;

public class ArraysEmpty {
    public static void main(String[] args) {
	someEmptyInts();
	someEmptyStrings();
    }

    private static void someEmptyInts() {
	int[] evens = new int[5];
	evens[0] = 2;
	evens[1] = 4;
	evens[3] = 8;
	for (int elem : evens) {
	    System.out.println("elem " + elem);
	}
    }

    private static void someEmptyStrings() {
	String[] cities = new String[5];
	cities[0] = "Dublin";
	cities[2] = "Tokyo";
	cities[4] = "Sydney";
	for (String city : cities) {
	    System.out.println("city " + city);
	}
    }
}
