package com.micarney.objectmaster;

public class Wizard extends Human{

	public Wizard() {
		this.setIntelligence(8);
		this.setHealth(50);
	}
	public void heal(Human human) {
		int heal = this.getIntelligence();
		human.setHealth(8);
		System.out.println("Healed " + human.getName() + " for " + heal );
	}
	public void fireball(Human human) {
		int dmg = this.getIntelligence() *3;
		human.setHealth(-dmg);
		System.out.println("Damaged " + human.getName() + " for " + dmg);
	}
}
