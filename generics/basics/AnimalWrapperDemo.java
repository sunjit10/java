package generics.basics;

public class AnimalWrapperDemo<E> {
    
    private E someObject;

    public E get() {
	return someObject;
    }
    
    public void set(E object) {
	someObject = object;
    }
    
    public static void main(String[] args) {
	AnimalWrapperDemo<Cat> awd = new AnimalWrapperDemo<>();
	
	Cat cat = new Cat("jiggles");
	awd.set(cat);
	System.out.println(awd.get());

	alsoWorksForParentMammal();
	alsoWorksForGrandParentCreature();	
    }

    private static void alsoWorksForParentMammal() {
	AnimalWrapperDemo<Mammal> awd2 = new AnimalWrapperDemo<>();
	
	Cat cat2 = new Cat("squeaky");
	awd2.set(cat2);
	System.out.println(awd2.get());
    }

    private static void alsoWorksForGrandParentCreature() {
	AnimalWrapperDemo<Creature> awd3 = new AnimalWrapperDemo<>();
	
	Cat cat3 = new Cat("perkins");
	awd3.set(cat3);
	System.out.println(awd3.get());
    }
}
