package basics.core;

/*
 * For a sentence with all types of spaces, special characters etc, split it so that
 * I get just words with english alphabets. Ignore single character like A or I
 */
public class SplitWords {
    public static void main(String[] args) {

	String sentence = "Hello: How are you? It is cold/windy/rainy outside! Mike's wearning jacket; I should do the same..";

	String[] words = sentence.split("[^a-zA-Z]+");

	for (var word : words) {
	    if (word.length() < 2) {
		continue;
	    }
	    System.out.println(word);
	}
    }
}
