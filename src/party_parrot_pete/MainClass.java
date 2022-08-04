package party_parrot_pete;

class parrotPrinter
{
	int[] dimensions = {3,5};
	
	
}

public class MainClass 
{

	public static void main(String[] args) 
	{
		System.out.println("Party Parrot Pete");
		
		NotSmartAlphabet alphabet = new NotSmartAlphabet();
		alphabet.setUp();
		alphabet.printAll();

	}

}
