package lambdas;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.Collectors;

// There is an Integer list with few duplicate values.
// Goal: Ignore duplicates and get the sum of all unique values
public class ImperativevsDeclarative2 {
    public static void main(String[] args) {

	List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
	imperativeWay(integerList);
	declarativeWay(integerList);
    }

    private static void imperativeWay(List<Integer> integerList) {
	List<Integer> uniqueList = new ArrayList<>();
        int sum = 0;
	for (Integer e : integerList) {
	    if (!uniqueList.contains(e)) {
		uniqueList.add(e);
		sum += e;
	    }
	}
	System.out.println(uniqueList);
	System.out.println(sum);

    }

    private static void declarativeWay(List<Integer> integerList) {
	List<Integer> uniqueList =
	    integerList.stream()
	               .distinct()
	               .collect(Collectors.toList());

	System.out.println(uniqueList);
    }
}
