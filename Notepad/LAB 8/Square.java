package PartA;

public class Square extends GeometricFigure{
	
	public Square (double height, double width){
		super(height, width);
	}
	
	public double area(){
		double area;
		area = height*width;
		return area;
	}
	
	public String toString(){
		String str = "Square toString: " + "\n";
		str = str + super.toString();
		str = str + "Area: " + this.area() + "\n";
		return str;
	}
}