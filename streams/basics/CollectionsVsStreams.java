package streams.basics;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
	collectionsAllowsAddRemove();
	collectionsCanBeIteratedAnyNumberOfTimes();
    }

    private static void collectionsAllowsAddRemove() {
	List<String> westernStates = new ArrayList<>(List.of("CA","OR","WA"));
	westernStates.add("NV");
	westernStates.remove(1);
	
	System.out.println(westernStates);
	// there are no add/remove operations in streams
    }

    private static void collectionsCanBeIteratedAnyNumberOfTimes() {
	List<String> southwesternStates = new ArrayList<>(List.of("NM", "UT", "AZ", "CO"));

	southwesternStates.forEach(System.out::println);
	southwesternStates.forEach(System.out::println);
	southwesternStates.forEach(System.out::println);

	System.out.println("----------------");
	
	Stream<String> southwesternStatesStream = southwesternStates.stream();
	southwesternStatesStream.forEach(System.out::println);
	// Cannot do the line below
	//southwesternStatesStream.forEach(System.out::println);
    }						       
}
	
