package com.micarney.models;

public class Cat extends Animal implements Pet {
	public Cat() {
		
	}
	public Cat(String name, String breed, Integer weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
			return("Your " + getBreed() + " cat, " + getName() + ", is probably trying to kill you");
	}
}
