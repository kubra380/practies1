package perfectnumber;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		int total=0;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Number:");
		number=input.nextInt();
		
		if(number<=1) {
			
			System.out.println("Is not perfect number!");
			
		}else {
			
		for(int i=1;i<number;i++) {
			if(number%i == 0) {
				
				total+=i;
			}
		}
		
		if(total%number==0) {
			
			System.out.println(number+" Perfect Number!");
		}else {
			
			System.out.println(number+" Is not percet number!");
		}
		}
		input.close();
}

}
