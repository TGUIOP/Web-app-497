public class Spinner {
	private int arrow;
	private int noSections;
	private static final int DEFAULT_ARROW=0;
	private static final int DEFAULT_SECTION_NO=10;
	public Spinner() {
		setArrow(DEFAULT_ARROW);
		setSectionNo(DEFAULT_SECTION_NO);
	}
	public Spinner(int newArrow, int sections) {
		setArrow(newArrow);
		setSectionNo(sections);
	}
	public int getArrow() {
		return arrow;
	}
	public void setArrow(int newArrow) {
		if (newArrow>=0 && newArrow<=9) arrow=newArrow;
		else arrow=DEFAULT_ARROW;
	}
	
	public int getSectionNo(){
		return this.noSections;
	}
	public void setSectionNo(int sections){
		this.noSections = sections;
	}
	public void spin() {
		arrow = (int)(Math.random()*10);
	}
	public String toString() {
	    return "Arrow=" + arrow;
	}
	public boolean equals(Spinner that) {
		if (this.getArrow() == that.getArrow() && this.getSectionNo() == that.getSectionNo()) return true;
		else return false; 
	}	
}
