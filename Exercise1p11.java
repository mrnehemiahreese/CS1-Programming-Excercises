
public class Exercise1p11 {

	public static void main(String[] args) {
		
	int BRPS = 7;   //BIRTH RATE PER SECOND
	int DRPS = 13;  //DEATH RATE PER SECOND
	int IRPS = 45;  //IMMIG RATE PER SECOND
	
	double CURPOP = 312032486;
			
	double yearinseconds = 365*24*60*60;
	
	double BPY = yearinseconds / BRPS;   //BIRTH RATE PER  YEAR
	double DPY  = yearinseconds / DRPS;   //DEATH RATE PER YEAR
	double IPY  = yearinseconds / IRPS;		 //IMMIG RATE PER YEAR
	double growth = BPY + IPY -DPY;
	
	
	System.out.println("Population for next five years:");
	System.out.print("2017: ");
	System.out.printf("%.2f \n", CURPOP + growth);
	CURPOP += growth;
	System.out.print("2018: ");
	System.out.printf("%.2f \n", CURPOP + growth);
	CURPOP += growth;
	System.out.print("2019: ");
	System.out.printf("%.2f \n", CURPOP + growth);
	CURPOP += growth;
	System.out.print("2020: ");
	System.out.printf("%.2f \n", CURPOP + growth);
	CURPOP += growth;
	System.out.print("2021: ");
	System.out.printf("%.2f \n", CURPOP + growth);

	}

}
