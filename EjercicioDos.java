import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     String nombre = "";
	     float a = 0;
	     
	     System.out.println("Cual es su nombre?: ");
	     nombre = in.nextLine();
	     
	     System.out.println("Cual fue la eficiencia de su combustible en millas?:");
	     a = in.nextFloat();
	     
	     System.out.println("La eficiencia de su combustible en l/km fue de: " + (2.3521 / a));
	}

}
