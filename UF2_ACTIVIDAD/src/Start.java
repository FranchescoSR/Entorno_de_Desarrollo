import java.util.Scanner;

public class Start {

	private static int hora;
	private static int minutos;
	private static int segundos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDatos = new Scanner(System.in);
		hora = 0;
		minutos = 0;
		segundos = 0;
		
		System.out.println("****************");
		System.out.println("***RETO 1 UF1***");
		System.out.println("****************");
		
		System.out.print("Introduzca hora: ");
        hora =  entradaDatos.nextInt();
        System.out.print("Introduzca minutos: ");
        minutos =  entradaDatos.nextInt();
        System.out.print("Introduzca segundos: ");
        segundos =  entradaDatos.nextInt();
		
		verificarHora(hora, minutos, segundos);
	}

	private static void verificarHora(int hora, int minutos, int segundos) 
	{
		if (hora >= 0 && hora < 24 && minutos >= 0 && minutos <= 60 && segundos >= 0 && segundos <= 60) 
		{
			System.out.println("Hora correcta");
		}
		else
		{
			System.out.println("Hora incorrecta");
		}
	}

}
