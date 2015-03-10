import java.util.*;
import java.io.*;

class Example {
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		String sDate, sTime, sDateTime;
		String eDate, eTime, eDateTime;
		String summaryIn;
		String locationIn;
		String priorityIn;
		
		System.out.print("Please enter start date (YYYYMMDD): ");
		sDate = input.nextLine();
		System.out.print("Please enter start time in military time (HHMM): ");
		sTime = input.nextLine();
		
		System.out.print("Please enter end date (YYYYMMDD): ");
		eDate = input.nextLine();
		System.out.print("Please enter end time in military time (HHMM): ");
		eTime = input.nextLine();
		
		System.out.print("Please enter summary of event: ");
		summaryIn = input.nextLine();
		System.out.print("Please enter location of event: ");
		locationIn = input.nextLine();
		System.out.print("Please enter priority of event (1-10): ");
		priorityIn = input.nextLine();	
		
		sDateTime = sDate + "T" + sTime + "00";
		eDateTime = eDate + "T" + eTime + "00";
		
		System.out.println(sDateTime);
		System.out.println(eDateTime);
		System.out.println(summaryIn);
		System.out.println(locationIn);
		System.out.println(priorityIn);
		
		
		
		String begin = "BEGIN:VCALENDAR\n";
		String version = "VERSION:2.0\n";
		String calscale = "CALSCALE:GREGORIAN\n";
		String publish = "METHOD:PUBLISH\n";
		String calname = "X-WR-CALNAME:LonganCal\n";
		String timezone = "X-WR-TIMEZONE:Pacific/Honolulu\n";
		String begin2 = "BEGIN:VEVENT\n";
		String dStart = "DTSTART;TZID=Pacific/Honolulu:" + sDateTime + "\n";
		String dEnd = "DTEND;TZID=Pacific/Honolulu:" + eDateTime + "\n";
		String classtype = "CLASS:PUBLIC\n";
		String location = "LOCATION:" + locationIn +"\n";
		String summary = "SUMMARY:" + summaryIn + "\n";
		String priority = "PRIORITY:" + priorityIn + "\n";
		String end2 = "END:VEVENT\n";
		String end = "END:VCALENDAR\n";
		
	
		PrintWriter pw = new PrintWriter(new FileWriter("testcalendar.ics"));
		pw.write(begin + version + publish + calscale + publish + calname + timezone + begin2 +
				dStart + dEnd + classtype + location + summary + priority + end2+ end);
		pw.close();
		
	}
	
	

	
	
	
}