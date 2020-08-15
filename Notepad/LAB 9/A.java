public abstract class A{

	public int a;
	private double aa;
	
	public A(){
		this.setA(0);
		this.setAA(0.00);
		System.out.println("Default constructor of Class A");
	}
	
	public A(int a, double aa){
		this.setA(a);
		this.setAA(aa);
	}
	
	public int getA(){
		return this.a;
	}
	
	public double getAA(){
		return this.aa;
	}
	
	public void setA(int a){
		this.a = a;
	}
	
	public void setAA(double aa){
		this.aa = aa;
	}
	
	public int m2(char a){
		int x=(int)a;
		System.out.println("m2 of A is executing now");
		return x;
	}
	
	public int m2(int x1){
		int y=10+x1; //get the returned value from the first version and add x1
		System.out.println("second version of m2 in A is executing now");
		return y;
	}
	
	public void m3(){
		System.out.println("m3 of A is executing now");
	}
	
	public String toString(){
		String str = "";
		str = str + "A class toString " + "\n";
		str = str + "int value: " +  this.getA() + "\n";
		str = str + "double value: " + this.getAA() + "\n";
		return str;
	}
	
	public abstract int m1();

}