package basics.core;

/**
 * CalculateTime - A utility class for time calculations and formatting
 * This class provides methods to calculate and format time durations in various units
 */
public class CalculateTime {
    // Constants for time unit conversions
    private static final long SECONDS_IN_MINUTE = 60;
    private static final long SECONDS_IN_HOUR = 3600;
    private static final long SECONDS_IN_DAY = 86400;
    private static final long SECONDS_IN_WEEK = 604800;
    private static final long SECONDS_IN_MONTH = 2592000; // Approximation: 30 days
    private static final long SECONDS_IN_YEAR = 31536000; // Approximation: 365 days

    public static void main(String[] args) {
        // Example 1: Short durations
        System.out.println("Example 1: Short durations");
        System.out.println("12 seconds: " + calculateUptime(12));
        System.out.println("90 seconds: " + calculateUptime(90));
        System.out.println("3600 seconds: " + calculateUptime(3600));
        System.out.println();
        
        // Example 2: Medium durations
        System.out.println("Example 2: Medium durations");
        System.out.println("3 hours, 25 minutes: " + calculateUptime(12300));
        System.out.println("1 day, 2 hours: " + calculateUptime(93600));
        System.out.println();
        
        // Example 3: Long durations
        System.out.println("Example 3: Long durations");
        System.out.println("1 week: " + calculateUptime(604800));
        System.out.println("1 month: " + calculateUptime(2592000));
        System.out.println("1 year: " + calculateUptime(31536000));
        System.out.println();
        
        // Example 4: Using detailed formatting
        System.out.println("Example 4: Detailed formatting");
        System.out.println("12345 seconds: " + calculateDetailedUptime(12345));
        System.out.println("86401 seconds: " + calculateDetailedUptime(86401));
        System.out.println("31536001 seconds: " + calculateDetailedUptime(31536001));
        System.out.println();
        
        // Example 5: Custom unit formatting
        System.out.println("Example 5: Custom unit formatting");
        System.out.println("12345 seconds in minutes: " + formatInUnit(12345, TimeUnit.MINUTES));
        System.out.println("12345 seconds in hours: " + formatInUnit(12345, TimeUnit.HOURS));
        System.out.println("12345678 seconds in days: " + formatInUnit(12345678, TimeUnit.DAYS));
        System.out.println("31536000 seconds in years: " + formatInUnit(31536000, TimeUnit.YEARS));
    }

    /**
     * Calculate uptime and return it in the most appropriate single unit
     * @param uptime Time duration in seconds
     * @return Formatted string with the appropriate time unit
     */
    public static String calculateUptime(long uptime) {
        if (uptime < 0) {
            return "Invalid time value";
        }
        
        // Calculate different time units
        long years = uptime / SECONDS_IN_YEAR;
        long months = uptime / SECONDS_IN_MONTH;
        long weeks = uptime / SECONDS_IN_WEEK;
        long days = uptime / SECONDS_IN_DAY;
        long hours = (uptime % SECONDS_IN_DAY) / SECONDS_IN_HOUR;
        long minutes = (uptime % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        long seconds = uptime % SECONDS_IN_MINUTE;
        
        // Return the most significant non-zero unit
        if (years > 0) {
            return years == 1 ? years + " Year" : years + " Years";
        } else if (months > 0) {
            return months == 1 ? months + " Month" : months + " Months";
        } else if (weeks > 0) {
            return weeks == 1 ? weeks + " Week" : weeks + " Weeks";
        } else if (days > 0) {
            return days == 1 ? days + " Day" : days + " Days";
        } else if (hours > 0) {
            return hours == 1 ? hours + " Hour" : hours + " Hours";
        } else if (minutes > 0) {
            return minutes == 1 ? minutes + " Minute" : minutes + " Minutes";
        } else {
            return seconds == 1 ? seconds + " Second" : seconds + " Seconds";
        }
    }
    
    /**
     * Calculate detailed uptime showing all relevant units
     * @param uptime Time duration in seconds
     * @return Formatted string with multiple time units
     */
    public static String calculateDetailedUptime(long uptime) {
        if (uptime < 0) {
            return "Invalid time value";
        }
        
        StringBuilder result = new StringBuilder();
        
        // Calculate different time units
        long days = uptime / SECONDS_IN_DAY;
        long hours = (uptime % SECONDS_IN_DAY) / SECONDS_IN_HOUR;
        long minutes = (uptime % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        long seconds = uptime % SECONDS_IN_MINUTE;
        
        // Build the detailed string
        if (days > 0) {
            result.append(days).append(days == 1 ? " day, " : " days, ");
        }
        if (hours > 0 || days > 0) {
            result.append(hours).append(hours == 1 ? " hour, " : " hours, ");
        }
        if (minutes > 0 || hours > 0 || days > 0) {
            result.append(minutes).append(minutes == 1 ? " minute, " : " minutes, ");
        }
        result.append(seconds).append(seconds == 1 ? " second" : " seconds");
        
        return result.toString();
    }
    
    /**
     * Enum for different time units
     */
    public enum TimeUnit {
        SECONDS, MINUTES, HOURS, DAYS, WEEKS, MONTHS, YEARS
    }
    
    /**
     * Format time in a specific unit
     * @param seconds Time duration in seconds
     * @param unit The desired time unit for output
     * @return Formatted string in the requested unit
     */
    public static String formatInUnit(long seconds, TimeUnit unit) {
        if (seconds < 0) {
            return "Invalid time value";
        }
        
        double result;
        String unitStr;
        
        switch (unit) {
            case YEARS:
                result = (double) seconds / SECONDS_IN_YEAR;
                unitStr = result == 1.0 ? "year" : "years";
                break;
            case MONTHS:
                result = (double) seconds / SECONDS_IN_MONTH;
                unitStr = result == 1.0 ? "month" : "months";
                break;
            case WEEKS:
                result = (double) seconds / SECONDS_IN_WEEK;
                unitStr = result == 1.0 ? "week" : "weeks";
                break;
            case DAYS:
                result = (double) seconds / SECONDS_IN_DAY;
                unitStr = result == 1.0 ? "day" : "days";
                break;
            case HOURS:
                result = (double) seconds / SECONDS_IN_HOUR;
                unitStr = result == 1.0 ? "hour" : "hours";
                break;
            case MINUTES:
                result = (double) seconds / SECONDS_IN_MINUTE;
                unitStr = result == 1.0 ? "minute" : "minutes";
                break;
            case SECONDS:
            default:
                result = seconds;
                unitStr = result == 1.0 ? "second" : "seconds";
                break;
        }
        
        // Format with 2 decimal places if needed
        if (result == (long) result) {
            return (long) result + " " + unitStr;
        } else {
            return String.format("%.2f %s", result, unitStr);
        }
    }
}
