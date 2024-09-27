package generics;

public class PairDemo {

    public static void main(String[] args) {

	Pair<String, Integer> pair1 = new Pair<>("Dallas", 180);
	Pair<String, Integer> pair2 = new Pair<>("El Paso", 700);

	System.out.println(pair1);
	System.out.println(pair2);
	
    }
}
