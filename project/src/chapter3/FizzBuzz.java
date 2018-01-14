package chapter3;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		//count from 1 to 100
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{//mult of 3 and 5
				System.out.println("fizz buzz");
			}
			else if(i % 3 == 0)
			{//mult of 3
				System.out.println("fizz");
			}
			else if(i % 5 == 0)
			{//mult of 5
				System.out.println("buzz");
			}
			else
			{//not mult of 3 or 5
				System.out.println(i);
			}
		}
	}
}