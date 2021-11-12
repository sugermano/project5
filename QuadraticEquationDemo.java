package project5;

import java.util.Scanner;

public class QuadraticEquationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input a, b, c: ");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation qe=new QuadraticEquation(a,b,c);
		double discrim=qe.getDiscriminant();
		System.out.println("discriminant is "+discrim);
		if(discrim>0) {
			System.out.println("root1 = "+qe.getRoot1()+", root2 = "+qe.getRoot2());
		}else if(discrim==0) {
			System.out.println("root1 = root2 = "+qe.getRoot1());
		}else {
			System.out.println("The equation has no roots");
		}
	}

}
