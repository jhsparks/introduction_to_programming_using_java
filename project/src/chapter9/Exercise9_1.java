package chapter9;

public class Exercise9_1
{
	public static void main(String[] args)
	{
		//make two rectangles
		Rectangle rect1 = new Rectangle(40, 4);
		Rectangle rect2 = new Rectangle(35.9, 3.5);
	
		System.out.println("rectangle 1");
		printAttributes(rect1);
		System.out.println("rectangle 2");
		printAttributes(rect2);
		
	}
	
	public static void printAttributes(Rectangle rectangle)
	{
		System.out.println("width: " + rectangle.getWidth());
		System.out.println("height: " + rectangle.getHeight());
		System.out.println("area: " + rectangle.getArea());
		System.out.println("perimeter: " + rectangle.getPerimeter());
	}
}