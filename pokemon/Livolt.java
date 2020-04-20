import java.math.*;

public class Livolt extends Rakurai{
    public Livolt(String name){
        super(name, 85, "Electric");
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(75);
    }
}