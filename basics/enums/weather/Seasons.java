package basics.enums.weather;

public enum Seasons {

    SUMMER("swimming"), FALL("hiking"), WINTER("skiing"), SPRING("cycling");

    private String seasonalActivity;

    // enum Constructor can only be called from inside
    // They are not visible or accessible outside the enum
    Seasons(String activity) {
	seasonalActivity = activity;
    }

    @Override
    public String toString() {
	return super.toString() + " is a great time for " + seasonalActivity;
    }
}
