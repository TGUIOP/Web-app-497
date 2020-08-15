public class Cylinder extends Circle{
	
	private float height;
	
	public Cylinder(){
		super();
		this.setHeight(3.2f);
	}
	
	public Cylinder(double radius, float height){
		super(radius);
		this.setHeight(height);
	}
	
	public Cylinder(Circle C, float height){
		super(C.getRadius());
		this.setHeight(height);
	}
	
	public float getHeight(){
		return this.height;
	}
	
	public void setHeight(float height){
		this.height = height;
	}
	
	public double Volume(){
		double volume;
		volume = super.Area()*this.getHeight();
		return volume;
	}
	
	public String toString(){
		String str = super.toString();
		str = str + "Height of cylinder: " + this.getHeight() + "\n";
		str = str + "Volume of cylinder: " + this.Volume() + "\n";
		return str;
	}
}