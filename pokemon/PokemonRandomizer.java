import java.util.*;

public class PokemonRandomizer{
    public static ArrayList<Pokemon> getPokemons(int num){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num < 1){
            return pokemons;
        }

        int pokemonNumber = (int)(Math.random() * num) + 1;
        
        for(int i = 0; i < pokemonNumber; i++){
            int type = (int)(Math.random() * 6);
            if(type == 0){
                pokemons.add(new Koiking("Wild Koiking"));
            }else if(type == 1){
                pokemons.add(new Gyarados("Wild Gyarados"));
            }else if(type == 2){
                pokemons.add(new Rakurai("Wild Rakurai"));
            }else if(type == 3){
                pokemons.add(new Livolt("Wild Livolt"));
            }else if(type == 4){
                pokemons.add(new Ekans("Wild Ekans"));
            }else if(type == 5){
                pokemons.add(new Arbok("Wild Arbok"));
            }
        }
        return pokemons;
    }
}