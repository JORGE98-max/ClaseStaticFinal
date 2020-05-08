import java.util.Scanner;
public class SiguiendoEjercicios {
	
	static int not;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero: ");
	     not = scan.nextInt();
	     
	     if(not >= 0 && not < 5) 
	    	 
	    	 System.out.println("INSUFICIENTE");
	    	 else if (not == 5) 
	    		 System.out.println("SUFICIENTE");
	    	 
	    	 else if(not == 6) 
	    		 System.out.println("BIEN");
	    	 
	    	 else if (not == 7 || not == 8) 
	    		 System.out.println("NOTABLE");
	    	 
	    	 else if (not == 9 || not == 10) 
	    		 System.out.println("SOBRESALIENTE");
	    	
	    	 
	    	 
	     
	     
	     
	     
	     
	     
	}
	
	

}
