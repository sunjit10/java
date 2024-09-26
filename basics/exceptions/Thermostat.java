package basics.exceptions;

public class Thermostat {

    // java.lang.Exception needs to be mentioned in throws
    public static void setVehicleTemp(double temp) throws Exception {
	if (temp < 32 || temp > 120) {
	    throw new Exception("Invalid vehicle temperature");
	}
	System.out.println("Temperature set to " + temp);
    }

    // Since it is RuntimeException, no need to mention using throws
    public static void setMachineTemp(double temp) {
	if (temp < 32 || temp > 120) {
	    throw new RuntimeException("Invalid machine temperature");
	}
	System.out.println("Temperature set to " + temp);
    }

}
