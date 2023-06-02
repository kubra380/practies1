package year;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//  artık yıllar 4 rakamının katı olan yıllardır ve 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır
		int year;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Year:");
		year=input.nextInt();
		
		//yıl 4 ve 100 tam bölünüyorsa artık yıldır 
		if((year %4 ==0)||(year % 100==0)) {
			System.out.println(year+" Lead Year ! ");
		}else {
			System.out.println(year+" Not a lead year! ");
		}
		input.close();
	}

}
