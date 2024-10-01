package generics;

public class Pair<T,S> {
    
    private T value1;
    private S value2;
    
    Pair(T value1, S value2) {
	this.value1 = value1;
	this.value2 = value2;
    }
    
    public T getOne() {
	return value1;
    }
    
    public S getTwo() {
	return value2;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(value1);
	sb.append(", ");
	sb.append(value2);
	return sb.toString();
    }
}
