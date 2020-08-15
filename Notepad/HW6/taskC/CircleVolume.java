public abstract class CircleVolume{
	
	private double radius;
	
	public CircleVolume(){
		this.setRadius(0);
	}
	
	public CircleVolume(double radius){
		this.setRadius(radius);
	}
	
	public CircleVolume(CircleVolume CircleV){
		this.setRadius(CircleV.getRadius());
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
	
	public abstract double getVolume();
}