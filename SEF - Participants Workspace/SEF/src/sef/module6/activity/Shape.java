package activity;

public abstract class  Shape {

	public String color;
//	private double side;
//	private double area;
//	private double perimeter;
	
	public Shape() {
		System.out.println("I am a Shape Constructor");
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public abstract double calculateArea(int x,int y);
	public abstract double calculatePerimeter(int x,int y);


}
