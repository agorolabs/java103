package exercise.arrays;

public class DayPrinter {
	public static void main(String[] args) {
		//initialise the array with the names of days of the week
		String[] daysOfTheWeek = {"Sunday","Monday","Tuesday","Wednesday","Thuesday","Friday","Saturday"};
		
		//loop through the array and print their elements to 		//stdout 
		for (int i= 0;i < daysOfTheWeek.length;i++ ){
			System.out.println(daysOfTheWeek[i]);
		}
	}
}
