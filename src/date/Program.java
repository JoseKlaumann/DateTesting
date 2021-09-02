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
		Date firstDate = sdf.parse(sc.nextLine());
		Date secondDate = sdf.parse(sc.nextLine());

		long diff = secondDate.getTime() - firstDate.getTime();

		TimeUnit timeH = TimeUnit.HOURS;
		long diffrenceH = timeH.convert(diff, TimeUnit.MILLISECONDS);
		System.out.println("The difference in hours is : " + diffrenceH);

		TimeUnit timeM = TimeUnit.MINUTES;
		long diffrenceM = timeM.convert(diff, TimeUnit.MILLISECONDS);
		System.out.println("The difference in min is : " + diffrenceM);
		diffrenceM %= 60;

		if (diffrenceH == diffrenceM) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)", diffrenceH, diffrenceM);
		}
		sc.close();
	}
}
