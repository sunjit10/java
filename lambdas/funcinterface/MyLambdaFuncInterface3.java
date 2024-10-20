package lambdas.funcinterface;


@FunctionalInterface
interface HowBigIsIt {
    int getSizeOfIt(String[] someArray);
}


public class MyLambdaFuncInterface3 {
    public static void main(String[] args) {
	HowBigIsIt howBig = (myArray) -> {
	    return myArray.length;
	};
	
	String numbers[] = {"one", "two", "three"};
	System.out.println(howBig.getSizeOfIt(numbers));

	String seasons[] = {"summer", "fall", "winter", "spring"};
	System.out.println(howBig.getSizeOfIt(seasons));
    }

}
