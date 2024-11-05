package java8;

/*
  Earlier you could use only enum and int in switch
  Since Java 7, you can use Strings
 */
public class SwitchNowSupportsStrings {
    public static void main(String[] args) {

	String[] seasons = {"Summer", "Fall", "Winter", "Spring"};

	for (String season: seasons) {
	    switch (season) {
	    case "Summer":
		System.out.println("Beach and Waterpark");
		break;
	    case "Fall":
		System.out.println("Halloween and Thanksgiving");
		break;
	    case "Winter":
		System.out.println("Christmas and New Year");
		break;
	    case "Spring":
		System.out.println("Easter Egg Hunt");
		break;
	    }

	}
	
    }
}
