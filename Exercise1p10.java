
public class Exercise1p10 {

	public static void main(String[] args) {
		int kilo = 14;
		double miles = kilo *1.6;
		double minutes = 45.5;
		double hours = minutes/60;
		double mph = miles/ hours;
		
		System.out.print("The runners average speed was ");
		System.out.printf("%3.2f ", mph);
		System.out.print("MPH ");	
	}

}
