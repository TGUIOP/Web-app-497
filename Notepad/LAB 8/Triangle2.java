package PartB;

public class Triangle2 extends GeometricFigure2 implements SidedObject{
	
	private int sides;
	
	public Triangle2(double height, double width){
		super(height, width);
		this.sides = 3;
	}
	
	public double area(){
		double area;
		area = (height*width)/2;
		return area;
	}
	
	public int displaySides(){
		return this.sides;
	}
	
	public String toString(){
		String str = "Triangle toString" + "\n";
		str = str + super.toString();
		str = str + "Area: " + this.area() + "\n";
		str = str + "Sides: " + displaySides() + "\n";
		return str;
	}
}