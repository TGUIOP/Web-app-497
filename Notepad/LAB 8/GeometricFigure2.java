package PartB;

public abstract class GeometricFigure2{
	
	public double height, width;
	
	public GeometricFigure2(){
		this.setHeight(0);
		this.setWidth(0);
	}
	
	public GeometricFigure2(double height, double width){
		this.setHeight(height);
		this.setWidth(width);
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public String toString(){
		String str = "";
		str = str + "Height: " +  this.getHeight() + "\n";
		str = str + "Width: " + this.getWidth() + "\n";
		return str;
	}
	
	public abstract double area();
}