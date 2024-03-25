package com.in28minutes.oops;

public class Book {

	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howMany) {
		setNoOfCopies(noOfCopies + howMany);
	}

	public void decreaseNoOfCopies(int howMany) {
		setNoOfCopies(noOfCopies - howMany);
	}

}
