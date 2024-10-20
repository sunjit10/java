package lambdas.funcinterface;

@FunctionalInterface
interface Greeting {

    public void welcome(String msg, String title);
}

public class PassingLambdas {
    public static void main(String[] args) {
	Greeting g = (m, t) -> System.out.println(m + " " + t);
	sendGreetings(g);
    }

    private static void sendGreetings(Greeting greeting) {
	greeting.welcome("Good Evening", "Sir");
	greeting.welcome("Good Day", "Madam");
    }
}
