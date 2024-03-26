package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);
		
		System.out.println(
				"The initial number of copies of Art of Compuer Programming is: " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("The intitial number of copies of Effective Java is: " + effectiveJava.getNoOfCopies());
		System.out.println("The initial number of copies of Clean Code is: " + cleanCode.getNoOfCopies());
		System.out.println("---------------------------------------------");
		
		artOfComputerProgramming.increaseNoOfCopies(100);
		effectiveJava.increaseNoOfCopies(50);
		cleanCode.increaseNoOfCopies(45);

		artOfComputerProgramming.decreaseNoOfCopies(10);
		effectiveJava.decreaseNoOfCopies(5);
		cleanCode.decreaseNoOfCopies(5);

		System.out.println(
				"The number of copies of Art of Compuer Programming is: " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("The number of copies of Effective Java is: " + effectiveJava.getNoOfCopies());
		System.out.println("The number of copies of Clean Code is: " + cleanCode.getNoOfCopies());
		System.out.println("---------------------------------------------");

	}

}
