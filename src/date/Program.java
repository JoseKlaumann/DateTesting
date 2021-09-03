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

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); //Formata e analisa conforme o padrao especificado
		Date firstDate = sdf.parse(sc.nextLine()); //Digitar a data desejada
		Date secondDate = sdf.parse(sc.nextLine());

		long diff = secondDate.getTime() - firstDate.getTime(); //As datas sao convertidas para milisegudos e aqui ele faz o calculo da diferenca
		
		//O método convert() da classe TimeUnit aceita dois parâmetros, que são duração do tempo e unidade da duração do tempo.
		
		TimeUnit timeHo = TimeUnit.HOURS; //Define que a conversao deve ser feita para horas
		long diffrenceH = timeHo.convert(diff, TimeUnit.MILLISECONDS); //Transforma os milisegundos em horas
		System.out.println("The difference in hours is : " + diffrenceH); 
		
		TimeUnit timeMi = TimeUnit.MINUTES;//Define que a conversao deve ser feita para minutos
		long diffrenceM = timeMi.convert(diff, TimeUnit.MILLISECONDS);//Transforma os milisegundos em minutos

		System.out.println("The difference in min is : " + diffrenceM);
		diffrenceM %= 60;//Caso de um valor maior ele utiliza este calculo e pega o resto da divisao como resposta

		System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)", diffrenceH, diffrenceM);
		sc.close();
	}
}
