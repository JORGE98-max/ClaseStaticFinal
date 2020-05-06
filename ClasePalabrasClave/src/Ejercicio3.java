import java.util.Scanner;
public class Ejercicio3 {

	static int zon;
	static double min;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double total;
		
		System.out.println("12 .- America del Norte");
		System.out.println("15 .- America Central");
		System.out.println("18 .- America del Sur");
		System.out.println("19 .- Europa");
		System.out.println("25 .- Africa");
		System.out.println("25 .- Asia");
		System.out.println("29 .- Oceania");
		
		System.out.println("Ingrese la clave de la Zona Geografica: ");
		 zon = scan.nextInt();
		System.out.println("Ingrese los minutos hablados: ");
		 min = scan.nextDouble();
		 
		 switch(zon) {
		 
		 case 12:
			 
			total = min * 2;
			System.out.println("Usted debe pagar s/."+ total);
			break;
		 case 15:
			 
				total = min * 2.2;
				System.out.println("Usted debe pagar s/."+ total);
				break;
		 case 18:
			 
				total = min * 4.5;
				System.out.println("Usted debe pagar s/."+ total);
				break;
		 case 19:
			 
				total = min * 5.5;
				System.out.println("Usted debe pagar s/."+ total);
				break;
		 case 25:
			 
				total = min * 6;
				System.out.println("Usted debe pagar s/."+ total);
				break;
		 case 29:
			 
				total = min * 5;
				System.out.println("Usted debe pagar s/."+ total);
				break;
		
		 }

		 
	}

}
