public class C extends A{

	public double c;
	
	public C(){
		super();
		this.setC(0.00);
		System.out.println("Default constructor of class C");
	}
	
	public C(int a, double aa, double c){
		super(a, aa);
		this.setC(c);
	}
	
	public double getC(){
		return this.c;
	}
	
	public void setC(double c){
		this.c = c;
	}
	
	public String toString(){
		String str = super.toString();
		str = str + "C value: " + this.getC() + "\n";
		return str;
	}
	
	public int m1(){
		int i2= a+(int)(c/2);
		System.out.println("m1 implementation of C is executing now");
		return i2;
	}
	
}