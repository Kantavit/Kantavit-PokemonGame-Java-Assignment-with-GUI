import java.math.*;

public class LeppaBerry extends Berry{
    public LeppaBerry(String name){
        super(name, 20, "LeppaBerry.jpg");
    }

    public void heal(Pokemon pokemon){
        System.out.println("Pokemon " + pokemon.getName() + " eating " + getName() + " (HP +20)");
        healing(pokemon, 20);
    }
}