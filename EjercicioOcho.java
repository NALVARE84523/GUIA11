import java.util.Scanner;
import java.text.DecimalFormat;

public class EjercicioOcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");

		float cb = 0;
		int pp = 10000;
		int cp = 2000;
		float nt = 0;
		double numeroViajes = 0;

		System.out.println("Cual es la capacidad del bus?:");
		cb = read.nextFloat();
		System.out.println("Cual es el numero total de turistas a transportar?:");
		nt = read.nextFloat();
		
		numeroViajes = Math.ceil(((nt * 1)/ cb));

		System.out.println("El bus realiza " + df.format(numeroViajes) + " viajes.");
		System.out.println("Los turistas pagan un total de: " + df.format(nt * pp));
		System.out.println("El conductor paga un total de: " + df.format(nt * cp));
	}
}
