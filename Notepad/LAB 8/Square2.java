package PartB;

public class Square2 extends GeometricFigure2 implements SidedObject{
	
	private int sides;
	
	public Square2 (double height, double width){
		super(height, width);
		this.sides = 4;
	}
	
	public double area(){
		double area;
		area = height*width;
		return area;
	}
	
	public int displaySides(){
		return this.sides;
	}
	
	public String toString(){
		String str = "Square toString: " + "\n";
		str = str + super.toString();
		str = str + "Area: " + this.area() + "\n";
		str = str + "Sides: " + displaySides() + "\n";
		return str;
	}
}