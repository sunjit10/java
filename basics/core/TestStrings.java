package basics.core;

public class TestStrings {

    final static String CAT_FORMAT_STR = "Count of cats: %d\n";
    
    public static void main(String[] args) {
	stringFormat();
    }

    // String.format 
    private static void stringFormat() {
	String catCount = String.format(CAT_FORMAT_STR, 3);
	System.out.println(catCount);
    }
}
