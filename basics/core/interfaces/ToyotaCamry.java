package basics.core.interfaces;

public class ToyotaCamry implements Car {

    public String getMake() {
	return "Toyota";
    }

    public String getModel() {
	return "Camry";
    }
    
    public static void main(String args[]) {
	ToyotaCamry tc = new ToyotaCamry();

	// default method in Interface
	System.out.println(tc.getCarType());

	// static method in Interface
	System.out.println(Car.getDriveType());
	
	System.out.println(tc.getMake());
	System.out.println(tc.getModel());
    }
}
