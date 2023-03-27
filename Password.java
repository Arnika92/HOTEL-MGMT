package day5;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter password");
			int pass=sc.nextInt();
			if(pass==123)
			{
				System.out.println("accepted");
				break;
			}
			/*else if(pass!=123)
			System.out.println("Reenter password");*/
			
			else if(i==3)
			{
				System.out.println("card blocked");
			}
		}
	}
}
		
