package basics.enums.fruits;

public class FruitSwitchDemo {
    public static void main(String[] args) {

	Fruit fruit = Fruit.BANANA;

	switch(fruit) {
	case APPLE:  System.out.println("Apple a Day");
	             break;
	case BANANA: System.out.println("Banana for Potassium");
	             break;
	case MANGO:  System.out.println("Tropical Mango");
	             break;
	default: System.out.println("Invalid Fruit");
	}
	
    }
}
