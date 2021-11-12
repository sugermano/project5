package project5;

public class QuadraticEquation {
	private double a,b,c;
	public QuadraticEquation(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		double discim=getDiscriminant();
		if(discim<0) return 0;
		return (-1*b+Math.sqrt(discim))/2*a;
	}
	public double getRoot2() {
		double discim=getDiscriminant();
		if(discim<0) return 0;
		return (-1*b-Math.sqrt(discim))/2*a;
	}
}
