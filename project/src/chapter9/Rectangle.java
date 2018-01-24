package chapter9;

/*
 * This class represents a Rectangle
 * @author Joe sparks
 */
public class Rectangle
{
	//class variables
	private double height = 0;
	private double width = 0;
	
	//constructors
	public Rectangle()
	{
		
	}
	
	public Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	//methods
	public double getHeight()
	{
		return this.height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getArea()
	{
		double area;
		area = this.height * this.width;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter;
		perimeter = 2 * this.width + 2 * this.height;
		return perimeter;
	}
}
