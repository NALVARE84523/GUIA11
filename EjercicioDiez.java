import java.util.Scanner;

public class EjercicioDiez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		float r1 = 0;
		float r2 = 0;
		float h1 = 0;
		float h2 = 0;
		double v1 = 0;
		double v2 = 0;
		
		System.out.println("Digite el radio del cono completo");
		r1 = read.nextFloat();
		System.out.println("Digite la altura del cono completo");
		h1 = read.nextFloat();
		System.out.println("Digite el radio del cono deficiente");
		r2 = read.nextFloat();
		System.out.println("Digite la altura del cono deficiente");
		h2 = read.nextFloat();
		
		v1 = (Math.PI * Math.pow(r1, 2) * h1)/3;
		v2 = (Math.PI * Math.pow(r2, 2) * h2)/3;
		
		if(r2 < r1) {
		System.out.println("El volumen del cono completo es: " + v1);
		System.out.println("El volumen del cono deficiente es: " + v2);
		System.out.println("El volumen del tronco de cono es: " + (v1 - v2));
		}
		else {
			System.out.println("El valor de r2 no puede ser mayor a r1, digite nuevamente un valor de r2.");
		}
	}

}
