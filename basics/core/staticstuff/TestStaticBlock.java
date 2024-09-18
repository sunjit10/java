package basics.core.staticstuff;

public class TestStaticBlock {
    static int NUM_CONTINENTS;
    static String OUR_PLANET;

    // Gets run first, even before constructors
    static {
	// Cannot declare inside static block
	//int NUM_CONTINENTS = 7; 
	NUM_CONTINENTS = 7;
	OUR_PLANET = "Earth";
    }
    
    public static void main(String[] args) {
	String msg = String.format("There are %d Continents in our Planet %s", getNumContinents(), OUR_PLANET);
	System.out.println(msg);
    }
    
    public static int getNumContinents() {
	return NUM_CONTINENTS;
    }
}
