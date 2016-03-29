import java.util.Scanner;

/**
 *   File Name: JoggedHoursLog.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 27, 2016
 *
 */

/**
 * JoggedHoursLog //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class JoggedHoursLog {
	static String[] details;
	static String name;
	/**
	 * @param args
	 */

	// Create a class variable of a Scanner object to allow user input to
	// console
	static Scanner scanner = new Scanner(System.in);
	static double sum;
	static double total;
	static String[] userVars;

	// method to say farewell to user
	public static void exitApplication() {
		// Message to say farewell to user
		System.out.println("\nThank you for using our jogging Application!");
		// Exit the system
		System.exit(0);

	}

	public static void main(String[] args) {
		// Declare local variables

		double days = 0;
		double hours = 0;
		double total = 0;
		double average;

		// Output a welcome message to user
		System.out.println("Hello, Welcome to our Jogging Log Application!");
		// Request the user's name
		System.out.println("Can I get your name please? ");
		// Set the captured name to a local String variable, name
		name = scanner.nextLine();

		System.out.println("How many days are you logging in this week " + name + "?");
		// Variable total
		total = Double.parseDouble(scanner.nextLine());

		// total = days * hours;

		details = requestUserInfo(name, "total");
		// Output the information to the user
		outputUserDetails(total);
		// Call method which gives a farewell to user and exits the system.
		exitApplication();

	}

	public static void outputUserDetails(Double total) {

		// Begin outputting user gathered details such as their name
		System.out.println("\nWell " + name + ", you jogged this week total: " + total);
		// Iterate through user details backwards, each iteration echos a detail
		for (int i = userVars.length - 1; i > 0; i--) {
			// Echo detail gathered of user info and requested details to
			// console
			System.out.println("Your " + details[i] + "is " + userVars[i] + ".");
		}

	}

	// This a method or function (Components that make up the method form a
	// method signature
	public static String[] requestUserInfo(String name, String... details) {
		// Create an array of Strings type objects to hold values for user, size
		// is based on supplied arguments
		userVars = new String[details.length];
		// Greet the user
		System.out.println("How many hours did you jogged today " + name + "?");
		// Perform a loop for the amount of iterations equal to the length of
		// supplied items
		for (int i = 0; i < details.length; i++) {
			// For each iteration ask the user for details
			System.out.println("Can I get your hours please? ");
			// Capture user input in relative variable within array
			userVars[i] = scanner.nextLine();

		}
		// return the String array of supplied details
		return details;
	}

}
