//URI 1047 - 02/09/2021
//No exercicio ele nao fala de datas (dd/MM/yyy), porem e necessario coloca-las se quiser trabalhar com o date
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

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date firstDate = sdf.parse(sc.nextLine());
		Date secondDate = sdf.parse(sc.nextLine());

		long diffrenceH = 0, diffrenceM = 0;

		long diff = secondDate.getTime() - firstDate.getTime();

		TimeUnit timeHo = TimeUnit.HOURS;
		diffrenceH = timeHo.convert(diff, TimeUnit.MILLISECONDS);
		System.out.println("The difference in hours is : " + diffrenceH);
		diffrenceH %= 24;
		
		TimeUnit timeMi = TimeUnit.MINUTES;
		diffrenceM = timeMi.convert(diff, TimeUnit.MILLISECONDS);

		System.out.println("The difference in min is : " + diffrenceM);
		diffrenceM %= 60;

		System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)", diffrenceH, diffrenceM);
		sc.close();
	}
}
