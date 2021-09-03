//URI 1047 - 02/09/2021
//Testando usar o Date 

package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date firstTime = sdf.parse(sc.nextLine());
		Date secondTime = sdf.parse(sc.nextLine());
		
		long allTime = secondTime.getTime() - firstTime.getTime();
		
		TimeUnit timeHours = TimeUnit.HOURS;
		long diffHours = timeHours.convert(allTime, TimeUnit.MILLISECONDS);
		System.out.println("The difference in hours is: " + diffHours);
		
		TimeUnit timeMinutes = TimeUnit.MINUTES;
		long diffMinutes = timeMinutes.convert(allTime, TimeUnit.MILLISECONDS);
		System.out.println("The difference in minutes is: " + diffMinutes);
		diffMinutes %= 60;
		
		if(diffHours == diffMinutes) {
			System.out.println("THE GAME LAST 24 HOUR(S) AND 0 MINUTE(S)");
		} else {
			System.out.printf("THE GAME LAST %s HOUR(S) AND %s MINUTE(S)", diffHours, diffMinutes);
		}
		
		sc.close();
	}
}
