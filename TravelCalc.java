package trvtim;
import java.util.Scanner;
public class TravelCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
	do 
	{
		//get input
		System.out.print("Enter miles: ");
		double miles = scanner.nextDouble();
		System.out.print("Enter miles per hour: ");
		double mph = scanner.nextDouble();
		
		//define hours and minutes
		double hours = miles / mph;
		
		int wholeHours = (int) hours;
		int minutes = (int) ((hours - wholeHours) * 60);
		
		//display that
		System.out.println("Estimated travel time:");
		System.out.println("Hours: " + wholeHours);
		System.out.println("Minutes" + minutes);
		
		//ask for repeat
		System.out.print("Would you like to go again? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
