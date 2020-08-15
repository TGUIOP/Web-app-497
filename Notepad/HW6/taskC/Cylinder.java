public class Cylinder extends CircleVolume{
	
	private float height;
	
	public Cylinder(){
		super();
		this.setHeight(3.2f);
	}
	
	public Cylinder(double radius, float height){
		super(radius);
		this.setHeight(height);
	}
	
	/*public Cylinder(CircleVolume C, float height){
		super(C.getRadius());
		this.setHeight(height);
	}*/
	
	public float getHeight(){
		return this.height;
	}
	
	public void setHeight(float height){
		this.height = height;
	}
	
	public double getVolume(){
		double volume;
		volume = super.Area()*this.getHeight();
		return volume;
	}
	
	public String toString(){
		String str = super.toString();
		str = str + "Cylinder class toString" + "\n";
		str = str + "Height of cylinder: " + this.getHeight() + "\n";
		str = str + "Volume of cylinder: " + this.getVolume() + "\n";
		return str;
	}
}