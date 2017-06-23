package com.acadgild;

public class Rectangle extends Figure{					//dim1 represents the length of the rectangle
	
	private double height=0;
	//Rectangle Constructor 
	Rectangle(double dim1, double height){
		super(dim1);			//Parent class constructor
		this.height=height;
	}
	//Prints out the Area of the rectangle
	public void findArea(){
		System.out.println("It's Area is "+(dim1*height)+" units-squared.");
	}
	//Prints out the Perimeter of the rectangle
	public void findPerimeter(){
		System.out.println("It's Perimeter is "+(2*(dim1+height))+" units.");
	}
	//Returns the Details of the rectangle
	public String toString(){
		return "This Rectangle has a Length and height of "+dim1+" and "+height+" units respectively.";
	}
	
}

