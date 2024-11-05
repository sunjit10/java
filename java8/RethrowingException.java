package java8;

class FirstException extends Exception  { }
class SecondException extends Exception { }

public class RethrowingException {
    public static void main(String[] args) throws Exception {
	beforeJava7("First");
	afterJava7("First");
    }

    // Before Java7, the throws should match what is thrown from catch even if
    // the actual Exception that can be thrown can be either FirstException or
    // SecondException
    public static void beforeJava7(String exceptionName) throws Exception {
	try {
	    if (exceptionName.equals("First")) {
		throw new FirstException();
	    } else {
		throw new SecondException();
	    }
	} catch (Exception e) {
	    throw e;
	}
    }
    
    // After Java7, the throws can list the actual FirstException and SecondException
    // even though the throw is inside java.lang.Exception
    public static void afterJava7(String exceptionName)
	throws FirstException, SecondException {
	try {
	    if (exceptionName.equals("First")) {
		throw new FirstException();
	    } else {
		throw new SecondException();
	    }
	} catch (Exception e) {
	    throw e;
	}
    }
}
