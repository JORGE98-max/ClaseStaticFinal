import java.util.Scanner;
public class Ejercicio1 {
	
	static int num1;
	static int num2;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
      
		
		System.out.println("Ingrese el primer numero: ");
		num1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			
			System.out.println(num1);
			System.out.println(num2);
		}
		else {
			
			System.out.println(num2);
			System.out.println(num1);
		}
		
		

	}

}
