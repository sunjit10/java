package basics.loops;

public class ForLoop {
    public static void main(String[] args) {
	forloop1();
	forloop2();
	forloop3();
    }

    private static void forloop1() {
	for (int i = 0; ;i++) {
	    System.out.println("i " + i);
	    if (i > 3) {
		break;
	    }
	}
    }

    private static void forloop2() {
	for (int i = 0; ; ) {
	    System.out.println("i " + i);
	    if (i > 3) {
		break;
	    }
	    i++;
	}
    }

    private static void forloop3() {
	int i = 0;
	for ( ; ; ) {
	    System.out.println("i " + i);
	    if (i > 3) {
		break;
	    }
	    i++;
	}
    }

}
