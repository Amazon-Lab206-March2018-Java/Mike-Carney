package com.micarney.objectmaster;

public class Samurai extends Human{
	private int count = 0;

	public Samurai() {
		this.setHealth(200);
		count =+ 1;
	}
	public void deathBlow(Human human) {
		human.setHealth(0);
		int wounded = this.getHealth()/2;
		this.setHealth(-wounded);
		System.out.println("Samurai killed " + human.getName() + " but was wounded for " + wounded);
	}
	public void meditate() {
		int heal = this.getHealth()*2;
		this.setHealth(heal);
		System.out.println("Samurai meditates and heals for " + heal);
	}	
	public int howMany() {
		return this.count;
	}
	
}
