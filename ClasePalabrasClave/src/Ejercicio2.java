import java.util.Scanner;
public class Ejercicio2 {
	
	static int num1, num2, num3;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Ingrese el primer numero: ");
		int num1 = scan.nextInt();
		System.out.println("Ingrese el primer numero: ");
		int num2 = scan.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int num3 = scan.nextInt();
		
		if (num1>num2 && num2 > num3) {
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}
		if (num2>num1 && num1 > num3) {
			System.out.println(num2);
		    System.out.println(num1);
		    System.out.println(num3);
		}
		if (num3>num2 && num2 > num1) {
			
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}
	}

}
