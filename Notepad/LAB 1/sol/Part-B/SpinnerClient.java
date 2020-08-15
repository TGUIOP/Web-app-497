public class SpinnerClient {
	public static void main(String[] args) {
		int sum;
		Spinner d1 = new Spinner();
		Spinner d2 = new Spinner(3,12);
		System.out.println("d1: " + d1.toString());
		System.out.println("d2: " + d2.toString());
		sum = d1.getArrow()+d2.getArrow();
		System.out.println("d1+d2=" + sum + "\n");
		System.out.println("Before Spinning: " + d1.equals(d2));
		d1.spin(); 
		d2.spin();
		System.out.println("After Spinning: " + d1.equals(d2));
		System.out.println("d1: " + d1.toString());
		System.out.println("d2: " + d2.toString());
		sum = d1.getArrow()+d2.getArrow();
		System.out.println("d1+d2=" + sum);
	}
}
