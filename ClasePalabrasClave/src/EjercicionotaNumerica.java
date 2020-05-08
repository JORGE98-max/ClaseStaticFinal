import java.util.Scanner;

public class EjercicionotaNumerica {
	
	static int nota;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese su nota : ");
		int nota = scan.nextInt();
		
		if (nota == 0)
			System.out.println("CERO");
		else if (nota == 1)
			System.out.println("UNO");
		else if (nota == 2)
			System.out.println("DOS");

		else if (nota == 3)
			System.out.println("TRES");

		else if (nota == 4)
			System.out.println("CUATRO");

		else if (nota == 5)
			System.out.println("CINCO");

		else if (nota == 6)
			System.out.println("SEIS");

		else if (nota == 7)
			System.out.println("SIETE");

		else if (nota == 8)
			System.out.println("OCHO");
		else if (nota == 9)
			System.out.println("NUEVE");

		else if (nota == 10)
			System.out.println("DIEZ");
		

		

	}

}
