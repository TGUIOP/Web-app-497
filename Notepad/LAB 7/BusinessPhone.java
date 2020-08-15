public class BusinessPhone extends Phone{
	
	private String Extension;
	private Phone phone;
	
	public BusinessPhone(){
		super();
		this.setExtension("0000");
	}
	
	public BusinessPhone(String AreaCode, String Exchange, String Number, String Extension){
		super(AreaCode, Exchange, Number);
		this.setExtension(Extension);
	}
	
	public BusinessPhone(Phone phone, String Extension){
		super(phone.getAreaCode(), phone.getExchange(), phone.getNumber());
		this.setExtension(Extension);
	}
	
	public String getExtension(){
		return this.Extension;
	}
	
	public void setExtension(String Extension){
		this.Extension = Extension;
	}
	
	public String toString(){
		String str = super.toString();
		str = str + " " + this.getExtension();
		return str;
	}
}