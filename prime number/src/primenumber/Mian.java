package primenumber;

public class Mian {

	

	public static void main(String[] args) {
	//asal sayı bulan program
	
		   int count = 0;
	        for(int N=2;N<=100;N++)
	        {
	            int control= 0;
	            for (int i = 2; i < N; i++)
	            {
	               if (N % i == 0)
	                {
	                    control = 1;
	                    break;
	                } 
	            }
	                
	            if(control==0)
	            {
	                System.out.println(N);
	                count++; 
	            }
	        }
	
	}

}
