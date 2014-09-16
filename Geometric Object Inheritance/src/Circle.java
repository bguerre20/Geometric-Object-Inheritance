
public class Circle extends GeometricObject
{
	double radius;
	
	//constructor with default radius of 1
	public Circle()
	{
		this.radius = 1;
	}
	
	//getter for radius variable
	public double getRadius()
	{
		return radius;
	}

	//setter for radius variable
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	//method to return the area of this circle object
	public double getArea()
	{
		return (2 * Math.PI * Math.pow(this.radius, 2));
	}
	
	//method to return the permiter of this circle object
	public double getPerimeter()
	{
		return (2 * Math.PI * this.radius);
	}
	
	//method to return the diameter of this object
	public double getDiameter()
	{
		return (2 * this.radius);
	}
}
