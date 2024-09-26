package basics.exceptions;

/*
 * Demonstrates the difference between java.lang.Exception 
 * and java.lang.RuntimeException
 */
public class ThermostatApp {
    public static void main(String[] args) {
	
	try {
	    Thermostat.setVehicleTemp(134.3);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
	// Unlike Exception no need to mention RuntimeException in throws
	Thermostat.setMachineTemp(140.3);
    }
}
