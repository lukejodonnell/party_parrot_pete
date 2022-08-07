
public class SmarterAlphabet {
	
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
    			},
    			{    //(space)
    				{ false, false, false, false, false, false, false},
    				{ false, false, false, false, false, false, false},
    				{ false, false, false, false, false, false, false},
    				{ false, false, false, false, false, false, false},
    				{ false, false, false, false, false, false, false},
    				{ false, false, false, false, false, false, false},
    				{ false, false, false, false, false, false, false},
    				{ false, false, false, false, false, false, false}
    			}
    	};
	
	public String line(char c, int line, String positive, String negative)
	{
		StringBuilder sb = new StringBuilder();
		int i = c - 65;
		if(c==' ')
		{
			i = 26;
		}
		for(boolean b : crazyArray[i][line])
		{
			if(b)
			{
				sb.append(positive);
			}
			else
			{
				sb.append(negative);
			}
		}
		return sb.toString();
	}
	
	public String slackLetter(char c, String positive, String negative)
	{
		StringBuilder sb = new StringBuilder();
		int letter = c - 65;
		if(c==' ')
		{
			letter = 26;
		}
		for(int i=0; i<crazyArray[letter].length; i++)
		{
			sb.append(this.line(c, i, positive, negative) + "\n");
		}
		return sb.toString();
	}
	
	public String slackString(String str, String positive, String negative, String spacer)
	{
		str = str.toUpperCase();
		StringBuilder spaceBuilder = new StringBuilder();
		for(int i=0; i<crazyArray[0][0].length; i++)
		{
			spaceBuilder.append(spacer);
		}
		String fullSpacer = spaceBuilder.toString();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			sb.append(slackLetter(str.charAt(i), positive, negative) + fullSpacer + "\n");
		}
		return sb.toString();
	}
	

}
