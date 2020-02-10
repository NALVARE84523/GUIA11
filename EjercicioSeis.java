import java.util.Scanner;



public class EjercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		double s = 0;
		double n = 0;
		double a = 0;

		System.out.println("Cual es el valor de la longitud de su poligono?:");
		s = read.nextDouble();
		System.out.println("Cuantos lados tiene su poligono?:");
		n = read.nextDouble();

		if(n != 2 && s !=0) {
			System.out.println("El valor del area del poligono regular es " + (a=(n * Math.pow(s, 2))/(4*Math.tan(Math.PI/n))));
			System.out.println("Segundo valor" + (4*Math.tan(Math.PI/n)));
			System.out.println("Tercer Valor" + (n * Math.pow(s, 2)));
		} else {
			System.out.println("El poligono no puede tener menos de 2 lados y un valor negativo de longitud.");
		}
	}
}