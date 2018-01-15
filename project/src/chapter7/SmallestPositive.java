package chapter7;

import java.util.Arrays;

public class SmallestPositive
{
	public static void main(String[] args)
	{
		//test 1
		int[] array1 = {-3, 1, 2, 3, 6, 7};
		
		System.out.println(solution(array1));
	}
	
    public static int solution(int[] A) 
    {
        //return the smallest positive integer that does NOT occur in the array A
        int smallest = 0;
    	
        //find missing positive integers
    	int[] positiveInts = new int[100001];
    	
        for(int j = 1; j <= 100000 ;j++)
        {
           for(int i = 0; i < A.length; i++)
           {
                if(j == A[i])
                {
                    positiveInts[j] = 1;
                }
           }
        }
        
        //find first 0 in positive ints
        for(int i = 1; i < positiveInts.length; i++)
        {
        	if(positiveInts[i] == 0)
        	{
        		smallest = i;
        		break;
        	}
        }
        
        return smallest;
    }
}