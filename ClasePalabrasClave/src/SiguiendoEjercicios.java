import java.util.Scanner;
public class SiguiendoEjercicios {
	
	static int not;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese su nota: ");
	     not = scan.nextInt();
	     
	     switch (not) {
	     
	     case 0: 
	     case 1: 
	     case 2: 
	     case 3: 
	     case 4:System.out.println("INSUFICIENTE");
	     break;
	     case 5: System.out.println("SUFICIENTE");
	     break;
	     case 6: System.out.println("BIEN");
	     break;
	     case 7: 
	     case 8: System.out.println("NOTABLE");
	     break;
	     case 9: 
	     case 10: System.out.println("SOBRESALIENTE");
	     break;
	     }
	     
	     

	    	 
	     
	     
	     
	     
	     
	}
	
	

}
