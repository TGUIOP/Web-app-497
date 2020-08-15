public class D extends C{
	
	public String str;
	
	public D(){
		super();
		this.setSTR("");
		System.out.println("Default constructor of class D");
	}
	
	public D(int a, double aa, double c, String str){
		super(a, aa, c);
		this.setSTR(str);
	}
	
	public String getSTR(){
		return this.str;
	}
	
	public void setSTR(String str){
		this.str = str;
	}
	
	public void m3(){
		//place the code here to execute the code from method m3 of class A first
		super.m3();
		System.out.println("I am executing m3 as implemented in class D");
	}
	
	public int m2(char c){
		int x;
		if(c == 'e'){
			x = super.m2(c);
			System.out.println("The m2(char c) version of D is executing now with returned value = " + x);
		}
		else{
			x = super.m2(100);
			System.out.println("The m2(char c) version of D is executing now with returned value = " + x);
		}
		return x;
	}
}