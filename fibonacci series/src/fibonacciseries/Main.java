package fibonacciseries;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int n1=0 , n2=1,n3,n;
		 Scanner scan=new Scanner(System.in);
		 n=scan.nextInt();
		 
		 System.out.println(n1);
		 System.out.println(n2);
		 
		 for(int i=2;i<n;i++) {
			n3=n2+n1;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			 
		 }
		 scan.close();

	}

}
