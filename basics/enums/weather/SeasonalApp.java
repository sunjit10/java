package basics.enums.weather;

public class SeasonalApp {
    public static void main(String[] args) {
	showSeasonalPlan();
    }

    private static void showSeasonalPlan() {
	for (Seasons season : Seasons.values()) {
	    System.out.println(season);
	}
    }
}
