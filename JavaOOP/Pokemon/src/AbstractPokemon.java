
public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon Squirtle = new Pokemon(name, health, type);
		return Squirtle;
		
	}
	public void attackPokemon(Pokemon Squirtle) {
		Squirtle.setHealth(Squirtle.getHealth()-10);
	}
}
