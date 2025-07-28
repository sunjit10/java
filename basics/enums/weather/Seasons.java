package basics.enums.weather;

/**
 * Represents the four seasons of the year and their associated activities.
 * Each season has a recommended seasonal activity.
 */
public enum Seasons {

    /**
     * Summer season with swimming as the recommended activity.
     */
    SUMMER("swimming"),
    
    /**
     * Fall season with hiking as the recommended activity.
     */
    FALL("hiking"),
    
    /**
     * Winter season with skiing as the recommended activity.
     */
    WINTER("skiing"),
    
    /**
     * Spring season with cycling as the recommended activity.
     */
    SPRING("cycling");

    private final String seasonalActivity;

    /**
     * Constructor for the Seasons enum.
     * Note: Enum constructors are implicitly private and can only be called from inside the enum.
     *
     * @param activity The recommended activity for this season
     */
    Seasons(String activity) {
        this.seasonalActivity = activity;
    }

    /**
     * Gets the seasonal activity associated with this season.
     *
     * @return The recommended activity for this season
     */
    public String getSeasonalActivity() {
        return seasonalActivity;
    }

    /**
     * Returns a string representation of this season including its name and recommended activity.
     *
     * @return A formatted string with the season name and activity
     */
    @Override
    public String toString() {
        return name() + " is a great time for " + seasonalActivity;
    }
}
