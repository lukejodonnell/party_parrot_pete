package party_parrot_pete;
import java.util.Scanner;

class parrotPrinter
{
	int[] dimensions = {3,5};
	
	
}

public class MainClass 
{

	public static void main(String[] args) 
	{
		System.out.println("Party Parrot Pete");
		
		ParrotPrinter par = new ParrotPrinter();
		Scanner sc = new Scanner(System.in);	
		
		par.print(sc.next());
		sc.close();
		
//		for(int i=0; i<500; i++)
//		{
//			par.print(sc.next());
//		}

	}

}
