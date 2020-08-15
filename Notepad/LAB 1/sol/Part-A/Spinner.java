public class Spinner {
	private int arrow;
	private static final int DEFAULT_ARROW=0;
	public Spinner() {
		setArrow(DEFAULT_ARROW);
	}
	public Spinner(int newArrow) {
		setArrow(newArrow);
	}
	public int getArrow() {
		return arrow;
	}
	public void setArrow(int newArrow) {
		if (newArrow>=0 && newArrow<=9) arrow=newArrow;
		else arrow=DEFAULT_ARROW;
	}
	public void spin() {
		arrow = (int)(Math.random()*10);
	}
	public String toString() {
	    return "Arrow=" + arrow;
	}
	public boolean equals(Spinner that) {
		if (this.arrow==that.arrow) return true;
		else return false; 
	}	
}
