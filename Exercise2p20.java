import java.util.Scanner;

public class Exercise2p20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double intrate = input.nextDouble();
		//intrate = intrate/100;
		double interest = balance *(intrate/1200);
		
		
		
		
		System.out.print("The the interest is ");
		System.out.printf("%.5f ", interest);
		
	}

}
