package basics.core.staticstuff;

public class MainApp {
    public static void main(String[] args) {
	Cat cat1 = new Cat("squeaky");
	Cat cat2 = new Cat("perkines");
	System.out.println(cat1);
	System.out.println(cat2);

	System.out.println("Total Cats " + cat1.getTotalCats());
	System.out.println("Total Cats " + cat2.getTotalCats());

	System.out.println("They eat " + Cat.FOOD);
	Cat.FOOD = "Purina Cat Food";
	System.out.println("Now they eat " + cat2.getCatFood());

    }
}
