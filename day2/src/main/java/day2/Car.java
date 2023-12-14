package day2;

public class Car {
	// day 3
	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	public void isPuncture() {
		System.out.println("Puncture");
	}
	public static void main(String[] args) {
		Car objName = new Car();
		objName.applyBrake();
		objName.soundHorn();		
		objName.isPuncture();
	}
}
