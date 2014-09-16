
public class Triangle extends GeometricObject
{
	double side1;
	double side2;
	double side3;
	
	//empty blank constructor
	public Triangle()
	{
		
	}
	
	//constructor that allows for custom side lengths
	public Triangle(double s1, double s2, double s3)
	{
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	// method to return the area of this triangle object
	public double getArea()
	{
		double halfPerim = getPerimeter() / 2;
		return Math.sqrt(halfPerim * ((halfPerim - this.side1) * (halfPerim - this.side2) * (halfPerim - this.side3)));
	}
	
	// method to return perimeter of this triangle object
	public double getPerimeter()
	{
		return (this.side1 + this.side2 + this.side3);
	}

	// Getters and setters for 3 sides
	public double getSide1()
	{
		return side1;
	}

	// Getters and setters for 3 sides
	public void setSide1(double side1)
	{
		this.side1 = side1;
	}

	// Getters and setters for 3 sides
	public double getSide2()
	{
		return side2;
	}

	// Getters and setters for 3 sides
	public void setSide2(double side2)
	{
		this.side2 = side2;
	}

	// Getters and setters for 3 sides
	public double getSide3()
	{
		return side3;
	}

	// Getters and setters for 3 sides
	public void setSide3(double side3)
	{
		this.side3 = side3;
	}
	
	// Getters and setters for 3 sides
	public String toString()
	{
		return("A triangle with side lengths of:\n Side1: " + this.side1 + "\n Side2: " + this.side2 + "\n Side3: " + this.side3);
	}
}
