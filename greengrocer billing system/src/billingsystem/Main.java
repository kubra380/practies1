package billingsystem;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pearPrice=2.14, applePrice = 3.67, tomatoPrice=1.11, bananaPrice=0.95, auberginePrice=5,total;
		int weight;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("How many kilos of pears:");
		weight=scan.nextInt();
		double price1=weight*pearPrice;
		
		System.out.print("How many kilos of apples:");
		weight=scan.nextInt();
		double price2=weight*applePrice;
		
		System.out.print("How many kilos of tomatoes:");
		weight=scan.nextInt();
		double price3=weight*tomatoPrice;
		
		System.out.print("How many kilos of bananas:");
		weight=scan.nextInt();
		double price4=weight*bananaPrice;
		
		System.out.print("How many kilos of aubergine:");
		weight=scan.nextInt();
		double price5=weight*auberginePrice;
		
		total=price1+price2+price3+price4+price5;
		System.out.println(total+ "TL");
		scan.close();;
	}

}
