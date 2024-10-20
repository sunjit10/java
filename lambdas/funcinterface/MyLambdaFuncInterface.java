package lambdas.funcinterface;

@FunctionalInterface
interface Runner {
    void getRunningDude(String msg);
}

@FunctionalInterface
interface Catcher {
    String catchIt();
}


public class MyLambdaFuncInterface {
    public static void main(String[] args) {
	Runner runner = (s) -> { System.out.println(s);};
	runner.getRunningDude("Zoom");

	Runner runner2 = s -> System.out.println(s);
	runner2.getRunningDude("Zoom Zoom");
	
	Catcher catcher = () -> { return "Caught!"; };
	System.out.println(catcher.catchIt());

	Catcher catcher2 = () -> "Caught Again!"; 
	System.out.println(catcher2.catchIt());	
    }
}
