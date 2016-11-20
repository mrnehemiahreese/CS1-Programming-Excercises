import java.util.Scanner;
public class Exercise2p5 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a subtotal and gratuity rate: ");
		double sub = input.nextDouble();
		double grat = input.nextDouble();
		double tot = grat + sub;
		
		grat = (grat/100) * sub;
		tot = grat + sub;
		
		
		
		
		System.out.print("The gratuity is $");
		System.out.printf("%.1f ", grat);
		System.out.print(" and the total is $");
		System.out.printf("%.1f ", tot);
		
		
		
		
	}
}
