public class CylinderSphereClient{
	
	public static void main(String[]args){
		//1
		Cylinder cylinder1 = new Cylinder(16, 21);
		System.out.println(cylinder1.toString());
		Sphere sphere1 = new Sphere(12);
		System.out.println(sphere1.toString());
		//2
		cylinder1.setRadius(18);
		System.out.println("radius of the cylinder1 set to " + cylinder1.getRadius());
		sphere1.setRadius(13.3);
		System.out.println("radius of the sphere1 set to " + sphere1.getRadius()+ "\n");
		System.out.println(cylinder1.toString());
		System.out.println(sphere1.toString());
		//3
		CircleVolume [] cv = new CircleVolume [4];
		Cylinder cylinder2 = new Cylinder(8, 12);
		Sphere sphere2 = new Sphere(15.2);
		Cylinder cylinder3 = new Cylinder(7.3, 15);
		Sphere sphere3 = new Sphere(10.6);
		
		cv[0] = cylinder2;
		cv[1] = sphere2;
		cv[2] = cylinder3;
		cv[3] = sphere3;
		
		//4
		for(int i=0; i<cv.length; i++){
			System.out.println(cv[i].toString());
		}
	}
}