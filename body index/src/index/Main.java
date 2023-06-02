package index;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double height,weight,bodyIndex;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter your height in meters (m):");
		height=input.nextDouble();
		
		System.out.print("Please enter your weight (kg):");
		weight=input.nextDouble();
		
		bodyIndex=weight/(height*height);
		System.out.println("Body Index:"+bodyIndex);
		
		input.close();
		
	}

}
