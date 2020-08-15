public class B extends A{
	
	public String s;
	
	public B (){
		super();
		this.setS("test");
		System.out.println("Default constructor of class B");
	}
	
	public B(int a, double aa, String s){
		super(a, aa);
		this.setS(s);
	}
	
	public String getS(){
		return this.s;
	}
	
	public void setS(String s){
		this.s = s;
	}
	
	public String toString(){
		String str = super.toString();
		str = str + "S: " + this.getS();
		return str;
	}
	
	public int m1(){
		int i1= 5*a+(int)super.getAA();
		System.out.println("m1 implementation of B is executing now");
		return i1;
	}
	
}