package com.micarney.StarWars.Droid;

public class R2D2 extends Droid implements Greet{
	public R2D2() {
		
}
	public R2D2(String name) {
		super(name);
	}
	public String sayHello() {
		return(getName() + " says, 'Beepbeep boooop wooooooo boop'" );
	}
}
