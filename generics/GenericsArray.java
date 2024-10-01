package generics;

public class GenericsArray<E> {

    private E[] array;
    private int position;

    @SuppressWarnings("unchecked")
    public GenericsArray(int size) {
	array = (E[]) new Object[size];
    }

    public void add(E e) {
	if (position == array.length) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	array[position++] = e;
    }

    public E get(int index) {
	return array[index];
    }

    public static void main(String[] args) {
	GenericsArray<String> stringArray = new GenericsArray<>(5);
	stringArray.add("Hello");
	stringArray.add("Hi");
	stringArray.add("Howdy");

	System.out.println(stringArray.get(1));

	GenericsArray<Double> doubleArray = new GenericsArray<>(5);
	doubleArray.add(434.33);
	doubleArray.add(33.11);
	doubleArray.add(112.1);

	System.out.println(doubleArray.get(1));
    }
    
}

