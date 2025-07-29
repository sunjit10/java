package basics.core;

/**
 * SplitWords demonstrates how to extract words from a text string
 * using regular expressions.
 * 
 * This class filters a sentence to extract only words containing English alphabets,
 * ignoring single-character words like "A" or "I".
 */
public class SplitWords {
    
    /**
     * Main method that demonstrates string splitting with regex.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Sample sentence with various punctuation and special characters
        String sentence = "Hello: How are you? It is cold/windy/rainy outside! Mike's wearning jacket; I should do the same..";
        
        // Split the sentence using regex that matches any sequence of non-alphabetic characters
        // This effectively extracts only alphabetic words
        String[] words = sentence.split("[^a-zA-Z]+");
        
        // Print each word that has at least 2 characters
        for (String word : words) {
            // Skip single-character words
            if (word.length() < 2) {
                continue;
            }
            System.out.println(word);
        }
    }
}
