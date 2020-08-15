package PartB;

public class UseGeometric2{
	
	public static void main(String []args){
	
		Square2 s1 = new Square2(10, 10);
		Triangle2 t1 = new Triangle2(10, 5);
		Square2 s2 = new Square2 (5,9);
		Square2 s3 = new Square2 (2.2, 6.2);
		Triangle2 t2 = new Triangle2 (3.6, 9.2);
		
		GeometricFigure2 [] fig = new GeometricFigure2[5];
		fig[0] = s1;
		fig[1] = s2;
		fig[2] = s3;
		fig[3] = t1;
		fig[4] = t2;
		
		for(int i =0; i<fig.length; i++){
			System.out.println(fig[i].toString());
		}
	}
}