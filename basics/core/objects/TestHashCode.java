package basics.core.objects;

public class TestHashCode {
    public static void main(String[] args) {
	Fox fox = new Fox();

	// output is format: package.classname@hashcodeashexnumber
	System.out.println("fox " + fox);

	// output is hashcode, %x shows in hex format
	System.out.printf("%x", fox.hashCode());
	System.out.println();

	// output is same hashcode as integer value for that hex
	System.out.println(fox.hashCode());
    }
}


class Fox {

    Fox() {
	System.out.println(this);
    }

}
