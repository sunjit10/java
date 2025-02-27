package streams.terminal;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CountingBasics {
    public static void main(String[] args) {
	List<String> states = new ArrayList<String>(List.of("NJ", "NY", "CT"));

	long numStates =
	    states.stream()
	    .collect(Collectors.counting());

	System.out.println(numStates);
    }
}
