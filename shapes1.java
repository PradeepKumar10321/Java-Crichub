class shape
{
	 String name;
	 int length;
	 int breadth;
	 int height;
	 static public void welcome()
	 {
	 	System.out.println("shapes using inheritance\n\n");
	 }
}
class square extends shape
{
	public int  calculate(int length)
	{
		return length*length;
	}
	public static void display(String name)
	{
		System.out.println("shape name: "+name);
	}
}
class rectangle extends shape
{
    public int calculate(int length,int breadth,int height)
	{
		return length*breadth*height;
	}
	public static void display(String name)
	{
		System.out.println("shape name: "+name);
	}
}
class triangle extends shape
{
    public int calculate(int breadth,int height)
	{
		return (breadth*height)/2;
	}
	public static void display(String name)
	{
		System.out.println("shape name: "+name);
	}
}
public class shapes1{
	public static void main(String args[])
	{
		square square = new square();
		rectangle rectangle = new rectangle();
		triangle triangle = new triangle();
		shape.welcome();
		int area_sq = square.calculate(25);
		int area_rec = rectangle.calculate(5,10,7);
		int area_tri = triangle.calculate(7,20);
		square.display("square");
		System.out.println("Area of the square: "+area_sq+"\n\n");
		rectangle.display("rectangle");
		System.out.println("Area of the rectangle: "+area_rec+"\n\n");
		triangle.display("triangle");
		System.out.println("Area of the triangle: "+area_tri);
	}
}
