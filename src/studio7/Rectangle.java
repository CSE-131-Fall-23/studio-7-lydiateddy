package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double initlength, double initwidth)
	{
		length  = initlength;
		width = initwidth;
	}
	public double Area()
	{
		return width*length;
	}
	public boolean isSquare()
	{
		if(width == length)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Rectangle A = new Rectangle(2.0,2.0);
		System.out.println(A.isSquare());
		Rectangle B = new Rectangle(1.0,3.0);
		if(A.Area()> B.Area())
			System.out.println("A>B");
		else
			System.out.println("B>A");
			

	}

}
