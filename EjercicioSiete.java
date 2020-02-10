import java.util.Scanner;

import java.text.DecimalFormat;

public class EjercicioSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#");

		float capacidadKilos = 0;
		float eficienciaCombustible = 0;
		int precioGalon = 10000;
		int num_km_BS = 80;
		float kilosNecesarios = 0;
		double numeroViajes = 0;
			
			System.out.println("Cual es la capacidad de kilos que puede transportar su camion?");
			capacidadKilos = read.nextFloat();
			System.out.println("Cuantos kilometros por galon hace su camion?");
			eficienciaCombustible = read.nextFloat();
			System.out.println("Cuantos kilogramos debe transportar?");
			kilosNecesarios = read.nextFloat();
			
			numeroViajes = Math.ceil(kilosNecesarios/capacidadKilos);
			
			
			System.out.println("Debe realizar " + df.format(numeroViajes) + " viajes");
			System.out.println("En cada viaje va a gastar " + (num_km_BS / eficienciaCombustible) + " galones");
			System.out.println("En total va a gastar " + df.format((num_km_BS / eficienciaCombustible) * precioGalon * (numeroViajes)) +  " en gasolina");
	}
}
