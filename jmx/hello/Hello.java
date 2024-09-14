package jmx.hello;

public class Hello implements HelloMBean {

    private static final int DEFAULT_CACHE_SIZE = 200;
    private final String name = "Reginald";
    private int cacheSize = DEFAULT_CACHE_SIZE;

    @Override
    public void sayHello() {
	System.out.println("Hello World");
    }

    @Override
    public int add(int x, int y) {
	return x + y;
    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public int getCacheSize() {
	return cacheSize;
    }

    @Override
    public void setCacheSize(int size) {
	this.cacheSize = size;
	System.out.println("Cache size is now " + this.cacheSize);
    }
    
}
