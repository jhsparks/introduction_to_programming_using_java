package chapter8;

/*
 * This class contains the main method for a program that compares two matrices
 * @author: joe sparks
 */
public class Exercise8_23
{
	/*
	 * This method is a test method for the class to call the equals method
	 * 
	 */
	public static void main(String[] args)
	{
		//initiallize matrices
		int[][] m1 = {{3, 5,}, {6, 9}};
		int[][] m2 = {{3, 4,}, {6, 9}}; 
		
		System.out.println(equals(m1, m2));
	}
	
	/*
	 * This program compares two matrices and turns false if they are 
	 * not equal
	 * precondition: two matrices must be passed as arguments
	 * postcondition: a boolean value is returned.
	 */
	public static boolean equals(int[][] m1, int[][] m2)
	{
		boolean equals = true;
		
		//compare 1 row at a time, if different, break and change to false
		//i will be the column number
		//j will be row number
		//outer loop looks at one row per iteration
		//inner loop looks at one index per iteration
		for(int j = 0; j < m1.length; j++)
		{
			for(int i = 0; i < m1[j].length; i++)
			{
				if(m1[j][i] != m2[j][i])
				{
					equals = false;
					break;
				}
			}
		}
		
		return equals;
	}
}