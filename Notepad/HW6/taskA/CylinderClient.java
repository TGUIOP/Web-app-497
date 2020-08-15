public class CylinderClient{
	
	public static void main(String[]args){
		
		Circle circle1 = new Circle(6);
		System.out.println(circle1.toString());
		
		Cylinder cylinder1 = new Cylinder(3, 8);
		System.out.println(cylinder1.toString());
		
		Circle circle = new Circle(4); //Circle object for cylinder2
		Cylinder cylinder2 = new Cylinder(circle, 12);
		System.out.println(cylinder2.toString());
		
		circle1.setRadius(3.5);
		System.out.println(circle1.toString());
		
		System.out.println("area of cylinder1: " + cylinder1.Area());
	}
}