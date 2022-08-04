package party_parrot_pete;

public class ParrotPrinter 
{
    NotSmartAlphabet alphabet = new NotSmartAlphabet();
	
	public void simplePrint(String str)
    {
    	for(int i=0; i<str.length(); i++)
    	{
    		System.out.println(str.charAt(i));
    	}
    }
    
    public void print(String str, char positive, char negative)
    {
    	alphabet.setUp();
    	for(int i=0; i<str.length(); i++)
    	{
    		alphabet.printChar(str.charAt(i));
    	}
    }
    
    public void print(String str) 
    {
    	this.print(str, 'X', ' ');
    }
}
