public class Sphere extends Circle{
	
	public Sphere(){
		super();
	}
	
	public Sphere(double radius){
		super(radius);
	}
	
	public Sphere(Circle C){
		super(C.getRadius());
	}
	
	public double Volume(){
		double volume;
		volume = (4/3)*Math.PI*Math.pow(super.getRadius(), 3);
		return volume;
	}
	
	public String toString(){
		String str = super.toString();
		str = str + "Sphere class toString" + "\n";
		str = str + "Volume of Sphere: " + this.Volume() + "\n";
		return str;
	}
}