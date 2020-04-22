import java.math.*;

public class OranBerry extends Berry{
    public OranBerry(String name){
        super(name, 30, "OranBerry.jpg");
    }

    public void heal(Pokemon pokemon){
        System.out.println("Pokemon " + pokemon.getName() + " eating " + getName() + " (HP +30)");
        healing(pokemon, 30);
    }
}