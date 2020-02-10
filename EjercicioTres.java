import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		double t1 = 0;
		double t2 = 0;
		double g1 = 0;
		double g2 = 0;
		double D = 0;
		double inverso = 0;
		
		
		System.out.println("Cual es la latitud de la primera ciudad?");
		t1 = read.nextFloat();
		System.out.println("Cual es la longitud de la primera ciudad?");
		g1 = read.nextFloat();
		System.out.println("Cual es la latitud de la segunda ciudad?");
		t2 = read.nextFloat();
		System.out.println("Cual es la longitud de la segunda ciudad?");
		g2 = read.nextFloat();
		
		inverso = Math.sin(t1);
		D = 6371.07 * Math.acos(inverso) * Math.asin(t2) + Math.cos(t1) * Math.cos(t2) * Math.acos(g1 - g2);
		
		System.out.println("La distancia entre las dos ciudades es " + D );
	}

}
