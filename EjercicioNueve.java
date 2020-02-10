import java.util.Scanner;

import java.text.DecimalFormat;

public class EjercicioNueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner read = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#");

		double capacidadHab = 4;
		int plato = 10000;
		int precioHab = 25000;
		double capacidadBus = 60;
		double gordos = 0;
		double flacos = 0;
		double diasTotales = 0;
		double puestosSillaGordos = 0;
		double puestosTotales = 0;
		double estudiantesTotales = 0;
		double costoDia = 0;
		double habT = 0;
		double costoHab = 0;
		
		System.out.println("Cuantos estudiantes gordos feos van al paseo?");
		gordos = read.nextDouble();
		System.out.println("Cuantos estudiantes flacos van al paseo");
		flacos = read.nextDouble();
		System.out.println("Cuantos dias va a durar el paseo?");
		diasTotales = read.nextDouble();
		
		puestosSillaGordos = (gordos*2);
		puestosTotales = (puestosSillaGordos + flacos);
		estudiantesTotales = (gordos + flacos);
		costoDia = (habT * precioHab);
		habT = Math.ceil((estudiantesTotales / capacidadHab));
		costoHab = Math.ceil(habT * precioHab);
		
		System.out.println("Los buses que usted necesita para el viaje son: " + df.format(Math.ceil(puestosTotales / capacidadBus)));
		System.out.println("Numero de platos que se van a servir al dia: " + ((gordos * 5)+(flacos * 3)));
		System.out.println("El costo total de los platos durante el paseo es: " + df.format((((gordos * 5) + (flacos * 3)) * diasTotales * plato)));
		System.out.println("El numero de habitacion a utilizar en el paseo son: " + df.format(habT));
		System.out.println("El costo de las habitaciones a utilizar por dia es: " + (habT * precioHab));
		System.out.println("El costo total del numero de habitaciones durante el paseo es: " + (costoHab * diasTotales));
	}
}
