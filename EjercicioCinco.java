import java.util.Scanner;

public class EjercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		float M = 0;
		float C = 4186;
		float DTemp = 0;
		float Q = 0;
		float tf = 0;
		float ti = 0;
		
		System.out.println("Digite el valor de la masa de la cantidad de agua en kg:");
		M = read.nextFloat();
		System.out.println("Digite el valor de la temperatura final en centigrados:");
		tf = read.nextFloat();
		System.out.println("Digite el valor de la temperatura inicial en centigrados:");
		ti = read.nextFloat();
		
		DTemp = ((tf + 273) - (ti + 273));
		Q = M * C * DTemp;
		if(ti < tf) {
		System.out.println("El valor de la cantidad toatl de energia es " + Q + " en Joule.");
		}
		else {
			System.out.println("La temperatura inicial no puede ser mayor a la temperatura final.");
		}
	
	}
}
