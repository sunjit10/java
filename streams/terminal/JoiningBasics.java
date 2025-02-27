package streams.terminal;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class JoiningBasics {
    public static void main(String[] args) {
	List<String> states = new ArrayList<String>(List.of("NJ", "NY", "CT"));

	String triStates =
	    states.stream()
	    .collect(Collectors.joining());

	System.out.println(triStates);

	// Using a delimiter
	triStates =
	    states.stream()
	    .collect(Collectors.joining("-"));
	
	System.out.println(triStates);

	// delimiter, prefix, suffix
	triStates =
	    states.stream()
	    .collect(Collectors.joining("-", "(", ")"));
	
	System.out.println(triStates);
    }
}
