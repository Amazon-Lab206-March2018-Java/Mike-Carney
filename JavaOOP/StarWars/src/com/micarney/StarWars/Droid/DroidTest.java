package com.micarney.StarWars.Droid;

public class DroidTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Droid R2D2 = new Droid ("R2D2", " says, 'Beepbeep boooop wooooooo boop'", "300lbs");
		R2D2.displayInfo();
		System.out.println(R2D2.getGreet());
		System.out.println(R2D2.getWeight());
	}
}