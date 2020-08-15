package PartA;

public class UseGeometric{
	
	public static void main(String []args){
	
		Square s1 = new Square(10, 10);
		Triangle t1 = new Triangle(10, 5);
		Square s2 = new Square (5,9);
		Square s3 = new Square (2.2, 6.2);
		Triangle t2 = new Triangle(3.6, 9.2);
		
		GeometricFigure [] fig = new GeometricFigure[5];
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