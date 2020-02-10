import java.util.Scanner;
import java.text.DecimalFormat;
public class EjercicioOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#");
		
		float a = 0, b = 0;

		
		System.out.println("Dame el primer valor para a:");
		a = leer.nextFloat();
		
		System.out.println("Dame el segundo valor para b:");
		b = leer.nextFloat();
		
		
		System.out.println("El resultado de la suma es " + df.format(a + b));
		System.out.println("El resultado de la resta es " + df.format(b - a));
		System.out.println("El resultado del producto es " + df.format(a * b));
		System.out.println("El resultado del cociente es " + (a / b));
		System.out.println("El resultado del residuo es " + (a % b));
		System.out.println("El resultado de la potencia " + df.format(+ Math.pow(a, b)));
		System.out.println("El resultado del logaritmo de a es " + ( + Math.log10(a)));
	}
}
