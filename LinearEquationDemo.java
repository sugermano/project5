package project5;

import java.util.Scanner;

public class LinearEquationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input a, b, c: ");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		LinearEquation le=new LinearEquation(a,b,c,d,e,f);
		boolean isSolvale=le.isSolvable();
		if(isSolvale) {
			System.out.println("x is "+le.getX()+" and y is "+le.getY());
		}else {
			System.out.println("The equation has no solution");
		}
	}

}
