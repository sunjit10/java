package basics.core.interfaces;

public interface Car {

    default String getCarType() {  return "Sedan"; }

    static String getDriveType() { return "2 Wheel Drive"; }

    String getMake();
    String getModel();
}
