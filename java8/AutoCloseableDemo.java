package java8;

/*
 * AutoCloseable has a single close() method
 * Useful for cleaning up resources. Ex: Scanner uses it.
 */
public class AutoCloseableDemo implements AutoCloseable {
    private String connection;
    
    public AutoCloseableDemo(String connection) {
	this.connection = connection;
    }
    
    public static void main(String[] args) {
	AutoCloseableDemo auto = new AutoCloseableDemo("madeuphost:9000");
	auto.createConnection();

	// If you don't have the line below, you get a warning about not calling close()
	auto.close();
    }
    
    public void createConnection() {
	System.out.println("Connection created");
    }
    
    @Override
    public void close() {
	System.out.println("Connection closed");
    }
}
