package com.narasimham;

public class Shapes {
	public double computeSquareArea(double length) {
		System.out.println("ret : "+(length*length));
		return length*length;
	}
	
	public double ComputeCircleArea(double radius) {
		double ret = 3.141*radius*radius;
		System.out.println("ret : "+ret);
		return ret;
	}
	
	public static void main(String[] args) {
		Shapes s = new Shapes();
		s.ComputeCircleArea(2);
	}

}
