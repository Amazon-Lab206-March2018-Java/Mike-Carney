package com.micarney.objectmaster;

public class Ninja extends Human{

	public Ninja() {
		this.setStealth(10);	
	}
	public void steal(Human human) {
		int dmg = this.getStealth();
		human.setHealth(-dmg);
		this.setHealth(dmg);
		System.out.println("Ninja steals your health for " + dmg + "and heals himself");
	}
	public void runAway() {
		this.setHealth(-10);
		System.out.println("Ninja runs away and takes " + 10 + " damage");
	}
	
}
