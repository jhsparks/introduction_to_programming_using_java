package chapter7;

import java.util.regex.*;

public class Interview 
{
	/*
	 * 
	 */
	public static void main(String[] args)
	{
		//set password for email account
        //restrictions: 
            //must contain one uppercase letter
            //can't contain digits
        //find LENGTH OF longest substring of S that meets restrictions
        //if not substring fits, return -1;
        
		String S = "a0aBa0B";
		
        //declare and initialize variables
        int length = -1;
        int max = 0;
        String sub = "";
        
        //method: use regex
        
        //create pattern
        Pattern regPattern = Pattern.compile("[\\D]*[A-Z][\\D+]*");
        
        //create matcher
        Matcher matchOb = regPattern.matcher(S);
        
        while(matchOb.find())
        {
        	sub = matchOb.group(0);
        	if(sub.length() > max)
        	{
        		max = sub.length();
        	}
        }
        
        if(max != 0)
        {	
        	System.out.println(max);
        }
        else
        {
        	System.out.println(length);
        }
	}
}
