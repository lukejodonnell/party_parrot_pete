package party_parrot_pete;

public class NotSmartAlphabet 
{
	FontBitArray letterA = new FontBitArray();
	FontBitArray letterB = new FontBitArray();
	FontBitArray letterC = new FontBitArray();
	
    private FontBitArray letter[] = new FontBitArray[26];
	
    boolean bMapA[][] = 
    	{
	        { false, false,  true,  true,  true, false, false},
	        { false,  true,  true, false,  true,  true, false},
	        {  true,  true, false, false, false,  true,  true},
	        {  true,  true, false, false, false,  true,  true},
	        {  true,  true,  true,  true,  true,  true,  true},
	        {  true,  true, false, false, false,  true,  true},
	        {  true,  true, false, false, false,  true,  true},
	        {  true,  true, false, false, false,  true,  true}
        };
    
    boolean bMapB[][] = 
    	{
    		{  true,  true,  true,  true,  true,  true, false},
    		{  true,  true, false, false, false,  true,  true},
    		{  true,  true, false, false, false,  true,  true},
    		{  true,  true,  true,  true,  true,  true, false},
    		{  true,  true, false, false, false,  true,  true},
    		{  true,  true, false, false, false,  true,  true},
    		{  true,  true, false, false, false,  true,  true},
    		{  true,  true,  true,  true,  true,  true, false}
    	};
    
    boolean bMapC[][] = 
    	{
    		{ false, false,  true,  true,  true,  true, false},
    		{ false,  true,  true, false, false,  true,  true},
    		{  true,  true, false, false, false, false, false},
    		{  true,  true, false, false, false, false, false},
    		{  true,  true, false, false, false, false, false},
    		{  true,  true, false, false, false, false, false},
    		{  true,  true, false, false, false, false, false},
    		{ false,  true,  true, false, false,  true,  true},
    		{ false, false,  true,  true,  true,  true, false}	
    	};
    
    boolean crazyArray[][][] = 
    	{
    			{	//A
    				{ false, false,  true,  true,  true, false, false},
    		        { false,  true,  true, false,  true,  true, false},
    		        {  true,  true, false, false, false,  true,  true},
    		        {  true,  true, false, false, false,  true,  true},
    		        {  true,  true,  true,  true,  true,  true,  true},
    		        {  true,  true, false, false, false,  true,  true},
    		        {  true,  true, false, false, false,  true,  true},
    		        {  true,  true, false, false, false,  true,  true}
    			},
    			{   //B
    	    		{  true,  true,  true,  true,  true,  true, false},
    	    		{  true,  true, false, false, false,  true,  true},
    	    		{  true,  true, false, false, false,  true,  true},
    	    		{  true,  true,  true,  true,  true,  true, false},
    	    		{  true,  true, false, false, false,  true,  true},
    	    		{  true,  true, false, false, false,  true,  true},
    	    		{  true,  true, false, false, false,  true,  true},
    	    		{  true,  true,  true,  true,  true,  true, false}
    			},
    			{   //C
    	    		{ false, false,  true,  true,  true,  true, false},
    	    		{ false,  true,  true, false, false,  true,  true},
    	    		{  true,  true, false, false, false, false, false},
    	    		{  true,  true, false, false, false, false, false},
    	    		{  true,  true, false, false, false, false, false},
    	    		{  true,  true, false, false, false, false, false},
    	    		{ false,  true,  true, false, false,  true,  true},
    	    		{ false, false,  true,  true,  true,  true, false}
    			},
    			{   //D
    				{  true,  true,  true,  true,  true,  true, false},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true,  true,  true,  true,  true, false}
    			},
    			{    //E
    				{  true,  true,  true,  true,  true,  true,  true},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true,  true,  true,  true, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true,  true,  true,  true,  true,  true}
    			},
    			{    // F
    				{  true,  true,  true,  true,  true,  true,  true},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true,  true,  true,  true, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false}
    			},
    			{    //G
    				{ false, false,  true,  true,  true,  true, false},
    	    		{ false,  true,  true, false, false,  true,  true},
    	    		{  true,  true, false, false, false, false, false},
    	    		{  true,  true, false, false, false, false, false},
    	    		{  true,  true, false, false,  true,  true,  true},
    	    		{  true,  true, false, false, false,  true,  true},
    	    		{ false,  true,  true, false, false,  true,  true},
    	    		{ false, false,  true,  true,  true,  true, false}
    			},
    			{    //H
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true,  true,  true,  true,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true}
    			},
    			{    //I
    				{  true,  true,  true,  true,  true,  true,  true},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{  true,  true,  true,  true,  true,  true,  true}
    			},
    			{    //J
    				{  true,  true,  true,  true,  true,  true,  true},
    				{ false, false, false,  true,  true, false, false},
    				{ false, false, false,  true,  true, false, false},
    				{ false, false, false,  true,  true, false, false},
    				{ false, false, false,  true,  true, false, false},
    				{ false, false, false,  true,  true, false, false},
    				{  true, false, false,  true,  true, false, false},
    				{  true,  true,  true,  true, false, false, false}
    			},
    			{    //K
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false,  true,  true, false},
    				{  true,  true, false,  true,  true, false, false},
    				{  true,  true,  true,  true, false, false, false},
    				{  true,  true, false,  true,  true, false, false},
    				{  true,  true, false, false,  true,  true, false},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true}
    			},
    			{    //L
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true,  true,  true,  true,  true,  true}
    			},
    			{    //M
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true,  true, false,  true,  true,  true},
    				{  true,  true,  true,  true,  true,  true,  true},
    				{  true,  true, false,  true, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true}
    			},
    			{    //N
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true,  true, false, false,  true,  true},
    				{  true,  true,  true,  true, false,  true,  true},
    				{  true,  true, false,  true,  true,  true,  true},
    				{  true,  true, false, false,  true,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true}
    			},
    			{    //O
    				{ false, false,  true,  true,  true, false, false},
    				{ false,  true,  true, false,  true,  true, false},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{ false,  true,  true, false,  true,  true, false},
    				{ false, false,  true,  true,  true, false, false}
    			},
    			{   //P
    				{  true,  true,  true,  true,  true,  true, false},
    				{  true,  true,  true, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true,  true, false, false,  true,  true},
    				{  true,  true,  true,  true,  true,  true, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false}
    			},
    			{    //Q
    				{ false, false,  true,  true,  true, false, false},
    				{ false,  true,  true, false,  true,  true, false},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false,  true,  true,  true,  true},
    				{  true,  true, false,  true,  true,  true,  true},
    				{ false,  true,  true, false,  true,  true,  true},
    				{ false, false,  true,  true,  true,  true,  true}
    			},
    			{    //R
    				{  true,  true,  true,  true,  true,  true, false},
    				{  true,  true,  true, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true,  true, false, false,  true,  true},
    				{  true,  true,  true,  true,  true,  true, false},
    				{  true,  true, false,  true,  true, false, false},
    				{  true,  true, false, false,  true,  true, false},
    				{  true,  true, false, false, false,  true,  true}
    			},
    			{    //S
    				{ false, false,  true,  true,  true, false, false},
    				{  true,  true, false, false, false,  true,  true},
    				{ false,  true,  true, false, false, false,  true},
    				{ false, false, false,  true,  true, false, false},
    				{ false, false, false, false, false,  true,  true},
    				{  true, false, false, false, false,  true,  true},
    				{  true,  true, false, false,  true,  true, false},
    				{ false, false,  true,  true,  true, false, false}
    			},
    			{    //  true
    				{  true,  true,  true,  true,  true,  true,  true},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false}   
    			},
    			{    //U
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{ false,  true,  true, false,  true,  true, false},
    				{ false, false,  true,  true,  true, false, false}
    			},
    			{    //V
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{ false,  true,  true, false,  true,  true, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false, false,  true, false, false, false}
    			},
    			{    //W
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false,  true, false,  true,  true},
    				{ false,  true,  true,  true,  true,  true, false},
    				{ false, false,  true, false,  true, false, false}
    			},
    			{    //X
    				{  true,  true, false, false, false,  true,  true},
    				{ false,  true,  true, false,  true,  true, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false, false,  true, false, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false,  true,  true, false,  true,  true, false},
    				{  true,  true, false, false, false,  true,  true},
    				{  true,  true, false, false, false,  true,  true}
    			},
    			{    //Y
    				{  true,  true, false, false, false,  true,  true},
    				{ false,  true,  true, false,  true,  true, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false},
    				{ false, false,  true,  true,  true, false, false}
    			},
    			{    //Z
    				{  true,  true,  true,  true,  true,  true,  true},
    				{ false, false, false, false,  true,  true, false},
    				{ false, false, false,  true,  true, false, false},
    				{ false, false,  true,  true, false, false, false},
    				{ false,  true,  true, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true, false, false, false, false, false},
    				{  true,  true,  true,  true,  true,  true,  true}
    			}	
    	};
    

    
    public void print(FontBitArray letter) 
    {
    	for(boolean l[] : letter.getMap())
    	{
    		for(boolean c : l)
    		{
    			if(c)
    			{
    				System.out.print("X");
    			}
    			else
    			{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public void setUp()
    {
        for(int i=0; i<26; i++)
        {
        	this.letter[i] = new FontBitArray();
        	this.letter[i].setMap(crazyArray[i]);
        }
    }
    
    public void printAll()
    {
    	for(int i=0; i<26; i++)
        {
        	this.print(this.letter[i]);
        	System.out.println();
        	System.out.println();
        }
    }
//    letter[0].setMap(
//    		{
//    		        { false, false,  true,  true,  true, false, false},
//    		        { false,  true,  true, false,  true,  true, false},
//    		        {  true,  true, false, false, false,  true,  true},
//    		        {  true,  true, false, false, false,  true,  true},
//    		        {  true,  true,  true,  true,  true,  true,  true},
//    		        {  true,  true, false, false, false,  true,  true},
//    		        {  true,  true, false, false, false,  true,  true},
//    		        {  true,  true, false, false, false,  true,  true}
//            }
//    		);


    
    
}
