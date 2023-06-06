package maxandmin;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,number;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		Scanner input=new Scanner(System.in);
		System.out.print("How many numbers will you enter?: ");
	    N=input.nextInt();
	    
	     for(int i=1;i<=N;i++) {
	    	 
	    	 number=input.nextInt();
	    	 System.out.println(i+". Number:"+number);
	    	 
	    	if(number>max) {
	    		max=number;
	    	}else if(number<min) {
	    		min=number;
	    	}
	    	
	     }
	    System.out.println("MAX Number:"+max);
	    System.out.println("MAX Number:"+min);
	    input.close();
	}

}
