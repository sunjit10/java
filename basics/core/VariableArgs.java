package basics.core;

public class VariableArgs {
    public static void main(String[] args) {
	greetings("Hello");
	greetings("Good Morning");
	greetings("Have a Nice Day");

	echoMessage(3, "Ho");
	echoMessage(2, "Ha Ha");
    }

    private static void greetings(String... messages) {
	for (String msg : messages) {
	    System.out.println(msg);
	}
    }

    // The variable args MUST be the last parameter
    private static void echoMessage(int count, String... messages) {
	for (String msg : messages) {
	    for (int i = 0; i < count; i++) {
		System.out.println(msg);
	    }
	}
    }

}
