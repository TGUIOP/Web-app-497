public class Circle{
	
	private double radius;
	
	public Circle(){
		this.setRadius(0);
	}
	
	public Circle(double radius){
		this.setRadius(radius);
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double Area(){
		double area;
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public double Circumference(){
		double circum;
		circum = Math.PI*2*radius;
		return circum;
	}
	
	public String toString(){
		String str = "";
		str = str + "Circle Radius: " +  this.getRadius() + "\n";
		str = str + "Area of the circle: " + this.Area() + "\n";
		str = str + "Circumference: " + this.Circumference() + "\n";
		return str;
	}
}