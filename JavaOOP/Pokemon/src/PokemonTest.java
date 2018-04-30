
public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon squirtle = new Pokemon("Squirtle", 60, "Water");
		System.out.println(pokedex.pokemonInfo(squirtle));
	}
}
