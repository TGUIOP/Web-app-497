public class CylinderSphereClient{
	
	public static void main(String[]args){
		//1
		Cylinder cylinder1 = new Cylinder(28, 35);
		System.out.println(cylinder1.toString());
		//2
		Sphere sphere1 = new Sphere(6);
		System.out.println(sphere1.toString());
		//3
		System.out.println("0 sphere is in the Cylinder" + "\n");
		//4
		Circle circle1 = new Circle(11);
		System.out.println(circle1.toString());
		//5
		Circle cylinder2 = new Cylinder(12, 12);
		System.out.println(cylinder2.toString());
		//6
		Circle sphere2 = new Sphere(8.5);
		System.out.println(sphere2.toString());
		//7
		Circle circle3 = new Circle(3.3);
		Cylinder cylinder3 = new Cylinder(9.2, 7.3f);
		Sphere sphere3 = new Sphere(7.7);
		Circle [] circleArray = new Circle[3];
		circleArray[0] = circle3;
		circleArray[1] = cylinder3;
		circleArray[2] = sphere3;
		
		for(int i=0; i<circleArray.length; i++){
			System.out.println(circleArray[i].toString());
		}
	}
}