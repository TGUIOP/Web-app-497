public class Client{
	
	public static void main(String[]args){
		
		System.out.println("First output" + "\n");
		B ObjB = new B();
		C ObjC = new C();
		
		ObjB.m1();
		ObjC.m1();
		
		System.out.println("\n" + "Second output" + "\n");
		D ObjD = new D();
		ObjD.m3();
		
		System.out.println("\n" + "Third output" + "\n");
		ObjD.m2('e');
		ObjD.m2('c');
		
	}
}