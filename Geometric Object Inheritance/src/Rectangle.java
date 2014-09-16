
public class Rectangle extends GeometricObject
{
	double height; 
	double width;
	
	//constructor with default height and width
	public Rectangle()
	{
		this.height = 1;
		this.width = 1;
	}
	
	//method to return area of this rectangle object
	public double getArea()
	{
		return (this.width * this.height);
	}
	
	//method to return the perimeter of this rectangle object
	public double getPerimeter()
	{
		return (this.width * 2 + this.height * 2);
	}

	//getter for height variable
	public double getHeight()
	{
		return height;
	}

	//setter for height variable
	public void setHeight(double height)
	{
		this.height = height;
	}

	//getter for width variable
	public double getWidth()
	{
		return width;
	}

	//setter for width variable
	public void setWidth(double width)
	{
		this.width = width;
	}
	
}
