import java.math.*;

public class Arbok extends Ekans{
    public Arbok(String name){
        super(name, 60, "Poison", "Arbok.jpg");
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(80);
    }
}