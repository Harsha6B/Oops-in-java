abstract class Shape
{
	int dim1;
	int dim2;
	
	public Shape(int dim1,int dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	abstract void printArea();
}
class Rectangle extends Shape
{
	public Rectangle(int length, int width)
	{
		super(length,width);
	}
	void printArea()
	{
		int area = dim1*dim2;
		System.out.println("Area of the Rectangle:" + area);
	}
}
class Triangle extends Shape
{
	public  Triangle(int base,int height)
	{
		super(base,height);
	}
	void printArea()
	{
	 	Double area = 0.5*dim1*dim2;
		System.out.println("Area of the Triangle:" + area);
	}
}
class Circle extends Shape
{
	public Circle(int radius)
	{
		super(radius,0);
	}
	void printArea()
	{
		double area = Math.PI * dim1 * dim1;
		System.out.println("Area of the Circle:" + area);
	}
}
public class Main1
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(5,10);
		Triangle t = new Triangle(5,10);
		Circle c = new Circle(7);
		r.printArea();
		t.printArea();
		c.printArea();
	}
}
