package streams.util;

import java.util.List;
import java.util.ArrayList;

public class CountStreamElements {
    public static void main(String[] args) {
	ArrayList<Integer> rollDice =
	    new ArrayList<Integer>(List.of(3,4,2,4,1,3,6,1));

	long numAllRolls = rollDice.stream().count();
	System.out.println(numAllRolls);
	
	
	long numUnique = rollDice.stream().distinct().count();
	System.out.println(numUnique);
    }
}
