import java.util.Scanner;

class Example {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int number = 0;
		String title;
		String startDate;
		String startTime;
		String endDate;
		String endTime;	
		String newString;
		
		System.out.print("Please Enter Title of event: ");
		title = input.nextLine();
		System.out.println(title);	
	
		
		System.out.print("Please Enter Start date: ");
		startDate = input.nextLine();
		System.out.println(startDate);		
		
		
		System.out.print("Please Start time: ");
		startTime = input.nextLine();
		System.out.println(startTime);	
	
		
		System.out.print("Please Enter End date: ");
		endDate = input.nextLine();
		System.out.println(endDate);	
		
		
		System.out.print("Please End time: ");
		endTime = input.nextLine();
		System.out.println(endTime);	
	}
}