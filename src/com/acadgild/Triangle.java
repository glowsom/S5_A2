package com.acadgild;


public class Triangle extends Figure{
	
	private double dim2=0;			//represents one side of the triangle
	private double dim3=0;			//represents the other side of the triangle
	private double height=0;
	
	//Triangle Constructor
	Triangle(double dim1, double dim2, double dim3, double height){
		super(dim1);			//Parent class constructor
		this.dim2=dim2;
		this.dim3=dim3;
		this.height=height;
	}

	//Prints out the Area of the triangle
	public void findArea(){
		System.out.println("It's Area is "+(0.5*dim1*height)+" units-squared.");
	}
	//Prints out the Perimeter of the triangle
	public void findPerimeter(){
		System.out.println("It's Perimeter is "+(dim1+dim2+dim3)+" units.");
	}
	//Returns the Details of the triangle
	public String toString(){
		return "This Triangle has 3 sides and height measuring "+dim1+", "+dim2+", "+dim3+" and "+height+" units respectively.";
	}
}
