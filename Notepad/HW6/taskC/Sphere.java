public class Sphere extends CircleVolume{
	
	public Sphere(){
		super();
	}
	
	public Sphere(double radius){
		super(radius);
	}
	
	public double getVolume(){//abstract method
		double volume;
		volume = (4/3)*Math.PI*Math.pow(super.getRadius(), 3);
		return volume;
	}
	
	public String toString(){
		String str = super.toString();
		str = str + "Sphere class toString" + "\n";
		str = str + "Volume of Sphere: " + this.getVolume() + "\n";
		return str;
	}
}