import java.util.Scanner;

public class Numeroalreves {

	static int numero;
	public static void main(String[] args) {

		String Cambionum;
		String palabrainvertida;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = scan.nextInt();
		
		Cambionum = Integer.toString(numero); //Convierto el int a String
	    StringBuffer buffer = new StringBuffer (Cambionum);
	    palabrainvertida = buffer.reverse(). toString(); // invierto la cadena
        
	        System.out.println("El numero invertido es : "+palabrainvertida);
	}

}
