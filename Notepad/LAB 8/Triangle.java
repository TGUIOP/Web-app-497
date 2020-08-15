package PartA;

public class Triangle extends GeometricFigure{
	
	public Triangle(double height, double width){
		super(height, width);
	}
	
	public double area(){
		double area;
		area = (height*width)/2;
		return area;
	}
	
	public String toString(){
		String str = "Triangle toString" + "\n";
		str = str + super.toString();
		str = str + "Area: " + this.area() + "\n";
		return str;
	}
}