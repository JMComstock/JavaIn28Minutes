package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike suzuki = new MotorBike();

		System.out.println("The initial speed of the ducati is: " + ducati.getSpeed());
		System.out.println("The initial speed of the honda is: " + honda.getSpeed());
		System.out.println("The initial speed of the honda is: " + suzuki.getSpeed());
		
		ducati.start();
		honda.start();

		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

		System.out.println("The speed of the ducati is: " + ducati.getSpeed());
		System.out.println("The speed of the honda is: " + honda.getSpeed());
		System.out.println("The initial speed of the honda is: " + suzuki.getSpeed());

	}

}