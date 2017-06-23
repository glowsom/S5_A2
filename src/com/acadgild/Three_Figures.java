package com.acadgild;

public class Three_Figures {

	public static void main(String[] args) {
		/*
		 *  TODO Display the area and perimeter of 3 Figures
		 *  (Circle, Rectangle and Triangle) and print the details for all.
		 */
		
		//Creating instances of Circle, Rectangle and Triangle.
		Circle disc = new Circle(3);
		Rectangle pad = new Rectangle(5,7);
		Triangle  card = new Triangle(3,4,5,4);

		//Prints out all the details of disc (Circle object), its Area and Perimeter.
		System.out.println(disc);
		disc.findArea();
		disc.findPerimeter();

		//Prints out all the details of pad (Rectangle object), its Area and Perimeter.
		System.out.println("\n"+pad);
		pad.findArea();
		pad.findPerimeter();

		//Prints out all the details of card (Triangle object), its Area and Perimeter.
		System.out.println("\n"+card);
		card.findArea();
		card.findPerimeter();
	}
}


/*
*Create three subclasses Circle, Rectangle and Triangle that extends Figure class
*and define both the methods. Write a program that will find the area and perimeter
*of 3 Figures and print the details for all.
*/
class Circle extends Figure{					//dim1 represents the radius of the circle
	//Constructor for Circle
	Circle(double dim1){
		super(dim1);
	}
	
	public void findArea(){
		//Prints out the Area of the circle
		//Math.PI returns 'pi' and Math.pow returns 'square of dim1'. so it prints pi*r^2
		System.out.println("It's Area is "+(Math.PI*(Math.pow(dim1, 2)))+" units-squared.");
	}
	public void findPerimeter(){
		//This prints 2*pi*r
		System.out.println("It's Perimeter is "+(2*Math.PI*dim1)+" units.");
	}
	//Returns the details of Circle
	public String toString(){
		return "This Circle has a Radius of "+dim1+" units.";
	}
}
