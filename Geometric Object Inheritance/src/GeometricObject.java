public class GeometricObject implements Comparable 
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}

	/**
	 * Construct a geometric object with the specified color
	 * and filled value
	 */
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor()
	{
		return color;
	}

	/** Set a new color */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean,
	 * its get method is named isFilled
	 */
	public boolean isFilled()
	{
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}

	public int compareTo(GeometricObject geoObj)
	{
		if (max(this, geoObj) > 0)		//first objects area is bigger
			return 1;
		else if (max(this, geoObj) < 0) //second objects area is bigger
			return -1;
		else							// areas are equal
			return 0;
	}
	
	public static double max(GeometricObject geoObj1, GeometricObject geoObj2)
	{
		double area1 = 0;
		double area2 = 0;
		//gets the type of geometric object for geoObj1
		if (geoObj1 instanceof Circle)
		{
			Circle circ1 = (Circle) geoObj1;
			area1 = circ1.getArea();
		}
		else if (geoObj1 instanceof Rectangle)
		{
			Rectangle rect1 = (Rectangle) geoObj1;
			area1 = rect1.getArea();
		}
		else if (geoObj1 instanceof Triangle)
		{
			Triangle tria1 = (Triangle) geoObj1;
			area1 = tria1.getArea();
		}
		
		//gets the type of geometric object for geoObj2
		if (geoObj2 instanceof Circle)
		{
			Circle circ2 = (Circle) geoObj2;
			area2 = circ2.getArea();
		}
		else if (geoObj2 instanceof Rectangle)
		{
			Rectangle rect2 = (Rectangle) geoObj2;
			area2 = rect2.getArea();
		}
		else if (geoObj2 instanceof Triangle)
		{
			Triangle tria2 = (Triangle) geoObj2;
			area2 = tria2.getArea();
		}
		
		return area1 - area2;
	}

	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		return 0;
	}
}