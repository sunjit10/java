package basics.inner;

public class AnonymousDemo {

    private String greetings = "Good ";

    public static void main(String[] args) {
	new AnonymousDemo().showDemo();
    }

    private void showDemo() {
	// Anonymous Class
	Runnable run1 = new Runnable() {
		public void run() {
		    System.out.println(greetings + " Evening");
		}
	    };
	activate(run1);
    }

    public void activate(Runnable runnable) {
	runnable.run();
    }

}
