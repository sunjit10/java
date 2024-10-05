package basics.core;

public class StringFormatDemo {

    final static String CAT_FORMAT_STR1 = "Count of cats: %d\n";
    final static String CAT_FORMAT_STR2 = "There are %d cats";
    
    public static void main(String[] args) {
	stringFormat();
    }

    // String.format 
    private static void stringFormat() {
	String catCount = String.format(CAT_FORMAT_STR1, 3);
	System.out.println(catCount);

	String catCount2 = String.format(CAT_FORMAT_STR2, 3);
	System.out.println(catCount2);
    }
}
