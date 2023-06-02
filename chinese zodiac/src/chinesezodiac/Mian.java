package chinesezodiac;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
	//Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
		int birth ;
		Scanner scan=new Scanner(System.in);
		System.out.print("Your year of birth:");
		birth=scan.nextInt();
		birth=birth%12;
		
		switch(birth){
			case 0:
				System.out.println("Çin Burcunuz Maymun");
				break;
			case 1:
				System.out.println("Çin Burcunuz Horoz");
				break;
			case 2:
				System.out.println("Çin Burcunuz Köpek");
				break;
			case 3:
				System.out.println("Çin Burcunuz Domuz");
				break;
			case 4:
				System.out.println("Çin Burcunuz Fare");
				break;
			case 5:
				System.out.println("Çin Burcunuz Öküz");
				break;
			case 6:
				System.out.println("Çin Burcunuz Kaplan");
				break;
			case 7:
				System.out.println("Çin Burcunuz Tavşan");
				break;
			case 8:
				System.out.println("Çin Burcunuz Ejderha");
				break;
			case 9:
				System.out.println("Çin Burcunuz Yılan");
				break;
			case 10:
				System.out.println("Çin Burcunuz At");
				break;
			case 11:
				System.out.println("Çin Burcunuz Koyun");
				break;
			default:
				System.out.println("Doğum yılını yanlış girdiniz");
				break;
		}
		
		
	  scan.close();

	}

}
