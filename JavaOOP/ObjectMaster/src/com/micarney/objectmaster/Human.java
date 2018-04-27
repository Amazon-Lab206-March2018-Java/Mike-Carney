package com.micarney.objectmaster;

public class Human {
	private String name;
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	public Human() {
		this.name = null;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	public void attack(Human human) {
		int dmg = this.getStrength();
		human.setHealth(-dmg);
		System.out.println(this.getName() + " hit " + human.getName() + " for " + dmg + " damage!");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}	
