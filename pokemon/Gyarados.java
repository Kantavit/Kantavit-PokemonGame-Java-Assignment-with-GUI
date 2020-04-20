import java.math.*;

public class Gyarados extends Koiking{
    public Gyarados(String name){
        super(name, 100, "Water");
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(130);
    }
}