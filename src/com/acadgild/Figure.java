package com.acadgild;

/*
*Create an abstract class Figure with property double diml,
*and functions: findArea() and findPerimeter()
*/
public abstract class Figure{
	protected double dim1=0;
	
	Figure(double dim1){
		this.dim1=dim1;
	}

	abstract void findArea();
	abstract void findPerimeter();
}