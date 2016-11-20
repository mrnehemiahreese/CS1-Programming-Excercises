import java.util.Scanner;

public class Exercise2p23 {
	
public static void main(String[] args) 
{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double gasprice = input.nextDouble();
		
		double cost = (distance / mpg) *  gasprice;
		
		
		
		
		
		System.out.print("The cost of driving is $");
		System.out.printf("%.2f ", cost);
		
}
}
