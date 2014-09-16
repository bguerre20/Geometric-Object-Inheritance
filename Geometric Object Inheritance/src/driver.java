
public class driver
{
	public driver()
	{
		//creating all needed geo objects for tests
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		
		Triangle t2 = new Triangle(3,4,5);
		
		Circle c2 = new Circle();
		c2.setRadius(5);
		Rectangle r2 = new Rectangle();
		r2.setHeight(4);
		r2.setWidth(7);
		Triangle t3 = new Triangle(3,4,5);
		
		//more proof that the objects are all children of geometric object
		GeometricObject[] geoObjectArray = new GeometricObject[] {c1, r1, t1, t2,c2, r2,t3};
		
		//proving the triangle to string method works
		System.out.println("Triangle 1: " + t1.toString());
		System.out.println("Triangle 2: " + t2.toString());
		System.out.println("Triangle 3: " + t3.toString());
		System.out.println("");
		
		//showing they are children of the Geometric Object class
		for(int i = 0;i< geoObjectArray.length;i++)
		{
			System.out.println("getObjectArray[" + i + "] :" + geoObjectArray[i].toString());
		}
		System.out.println("");
		//compare 2 circles
		if(c1.compareTo(c2) == 1)
			System.out.println("Circle 1 is larger than Circle 2. With respective areas of:\n 1. " + c1.getArea() + "\n 2. " + c2.getArea());
		else if (c1.compareTo(c2) == -1)
			System.out.println("Circle 2 is larger than Circle 1. With respective areas of:\n 1. " + c1.getArea() + "\n 2. " + c2.getArea());
		else 
			System.out.println("Circle 1 is the same area as Circle 2. With respective areas of:\n 1. " + c1.getArea() + "\n 2. " + c2.getArea());
		
		//compare 2 rectangles
		if(r1.compareTo(r2) == 1)
			System.out.println("Rectangle 1 is larger than Rectangle 2. With respective areas of:\n 1. " + r1.getArea() + "\n 2. " + r2.getArea());
		else if(r1.compareTo(r2) == -1)
			System.out.println("Rectangle 2 is larger than Rectangle 1. With respective areas of:\n 1. " + r1.getArea() + "\n 2. " + r2.getArea());
		else
			System.out.println("Rectangle 1 is the same area as Rectangle 2. With respective areas of:\n 1. " + r1.getArea() + "\n 2. " + r2.getArea());
		
		//compare 2 triangles
		if(t2.compareTo(t3) == 1)
			System.out.println("Triangle 2 is larger than Triangle 3. With respective areas of:\n 2. " + t2.getArea() + "\n 3. " + t3.getArea());
		else if(t2.compareTo(t3) == -1)
			System.out.println("Triangle 3 is larger than Triangle 2. With respective areas of:\n 2. " + t2.getArea() + "\n 3. " + t3.getArea());
		else
			System.out.println("Triangle 3 is the same area as Triangle 2. With respective areas of:\n 2. " + t2.getArea() + "\n 3. " + t3.getArea());
		
	}
}
