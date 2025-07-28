package basics.enums.weather;

/**
 * Application that demonstrates the use of the Seasons enum.
 * This class displays information about each season and its associated activity.
 */
public class SeasonalApp {
    
    /**
     * Main entry point for the application.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        showSeasonalPlan();
    }

    /**
     * Displays information about each season and its recommended activity.
     * Iterates through all values of the Seasons enum and prints each one.
     */
    private static void showSeasonalPlan() {
        System.out.println("Seasonal Activities Guide:");
        System.out.println("-------------------------");
        
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
        
        System.out.println("-------------------------");
        System.out.println("Enjoy your seasonal activities!");
    }
}
