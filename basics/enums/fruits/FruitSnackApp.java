package basics.enums.fruits;

public class FruitSnackApp {

    public static void main(String[] args) {
	Fruit fruit1 = Fruit.APPLE;
	Fruit fruit2 = Fruit.MANGO;
	Fruit fruit3 = Fruit.APPLE;
	
	basicInfo(fruit1, fruit2, fruit3);
	showValues();
	showOrdinals();
	showValueOf();
    }

    private static void basicInfo(Fruit fruit1, Fruit fruit2, Fruit fruit3) {
	System.out.println(fruit1);
	System.out.println(fruit2);

	System.out.println(fruit1.getClass());
	System.out.println(fruit1 == fruit3);
    }

    private static void showValues() {
	for (Fruit fruit : Fruit.values()) {
	    System.out.println(fruit);
	}
    }

    private static void showOrdinals() {
	for (Fruit fruit : Fruit.values()) {
	    String msg =
		String.format("Fruit %s has ordinal %d", fruit, fruit.ordinal());
	    System.out.println(msg);
	}
    }
    
    private static void showValueOf() {
	Fruit mango = Fruit.valueOf("MANGO");
	System.out.println(mango == Fruit.MANGO);
	
    }
}
