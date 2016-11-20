import java.util.Scanner;

public class Exercise2p4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double lbs = input.nextDouble();
		double kilo = lbs *.454;
		
		System.out.printf("%.1f ", lbs);
		System.out.print(" pounds is ");
		System.out.printf("%.3f ", kilo);
		System.out.print(" kilograms ");
		
		
		
	}
}
