package flightticket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int distance;
		int age, type;
		double total;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Distance(km):");
		distance=input.nextInt();
		
		System.out.print("Enter Age:");
		age=input.nextInt();
		
		System.out.print("Select Type:1)one way,2)double diretion:");
		type=input.nextInt();
		
		if((distance>0 && age>00)&&(type==1||type==2)) {
			total=distance*0.1;
				if(age<12) {
					total-=total*0.5;
				} else if(12<age && age<24) {
					
					total-=total*0.1;
					
				} else if(65<age) {
					
					total-=total*0.3;
					
				}
			 if(type==2) {
			
				total*=0.8;
				total*=2;
				
			}
			 System.out.println("Total(TL):"+total);
	}else {
		System.out.println("Incorrect data!");
	}

	}}
