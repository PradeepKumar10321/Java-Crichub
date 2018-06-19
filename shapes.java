class shape
{
	private String name;
	private int length;
	private int breadth;
	private int height;
	 shape(String n)
	{
		name=n;
	}
	public int  calculate(int length)
	{
		return length*length;
	}
	public int calculate(int length,int breadth,int height)
	{
		return length*breadth*height;
	}
	public int calculate(int breadth,int height)
	{
		return (breadth*height)/2;
	}
	public static void display(shape s)
	{
		System.out.println("shape name: "+s.name);
	}
}

public class shapes {
	public static void main(String args[])
	{
		shape square = new shape("square");
		shape rectangle = new shape("rectangle");
		shape triangle = new shape("triangle");
		int area_sq = square.calculate(25);
		int area_rec = rectangle.calculate(5,10,7);
		int area_tri = triangle.calculate(7,20);
		shape.display(square);
		System.out.println("Area of the square: "+area_sq);
		shape.display(rectangle);
		System.out.println("Area of the rectangle: "+area_rec);
		shape.display(triangle);
		System.out.println("Area of the triangle: "+area_tri);
	}
}
