public class Phone{
	
	private String AreaCode, Exchange, Number;
	
	public Phone(){
		this.setAreaCode("000");
		this.setExchange("000");
		this.setNumber("0000");
	}
	
	public Phone(String AreaCode, String Exchange, String Number){
		this.setAreaCode(AreaCode);
		this.setExchange(Exchange);
		this.setNumber(Number);
	}
	
	public String getAreaCode(){
		return this.AreaCode;
	}
	
	public String getExchange(){
		return this.Exchange;
	}
	
	public String getNumber(){
		return this.Number;
	}
	
	public void setAreaCode(String AreaCode){
		this.AreaCode = AreaCode;
	}
	
	public void setExchange(String Exchange){
		this.Exchange = Exchange;
	}
	
	public void setNumber(String Number){
		this.Number = Number;
	}
	
	public String toString(){
		String str = "";
		str = "(" + this.getAreaCode() + ")";
		str = str + this.getExchange();
		str = str + "-" + this.getNumber();
		return str;
	}
	
}