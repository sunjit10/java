package streams.util;

import java.util.List;
import java.util.ArrayList;

public class DistinctStreamElements {
    public static void main(String[] args) {
	ArrayList<Integer> rollDice =
	    new ArrayList<Integer>(List.of(3,4,2,4,1,3,6,1));
	rollDice.stream()
	    .distinct()
	    .forEach(System.out::println);
    }
}
