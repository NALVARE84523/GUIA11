import java.util.Scanner;

import java.text.DecimalFormat;

public class EjercicioCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");   
	    
	    double r = 0;
	    double a = 0;
	    double v = 0;
	    
	    System.out.println("Cual es valor de su radio en metros?: ");
	    r = in.nextDouble();
	    if(r > 0)
	    {
	    System.out.println("El area de su circulo es " + df.format(a = Math.PI * Math.pow(r, 2)) + " metros cuadrados.");
	    System.out.println("El volumen de su esfera es: " + df.format(v = (4 * Math.PI * Math.pow(r, 3) / 3)) + " metros cubicos.");
		
	    } else {
	    	System.out.println("El valor del radio del circulo y de la esfera no puede ser negativo.");
	    }
	}
}
