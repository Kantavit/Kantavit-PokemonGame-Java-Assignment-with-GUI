import java.math.*;

public class SitrusBerry extends Berry{
    public SitrusBerry(String name){
        super(name, 40, "SitrusBerry.jpg");
    }

    public void heal(Pokemon pokemon){
        System.out.println("Pokemon " + pokemon.getName() + " eating " + getName() + " (HP +40)");
        healing(pokemon, 40);
    }
}