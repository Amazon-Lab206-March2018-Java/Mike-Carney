package com.micarney.models;

public class Dog extends Animal implements Pet {
	public Dog() {
	}
	public Dog(String name, String breed, Integer weight) {
		super(name, breed, weight);
	}	
	public String showAffection() {
		return("Your dog, " + getName() + " is a good dog. Maybe even the best dog.");
	}
}
