import java.math.*;

public class Ekans extends Pokemon{
    public Ekans(String name){
        super(name, 40, "Poison", "Ekans.jpg");
    }

    public Ekans(String name, int maxHp, String type, String image){
        super(name, maxHp, type, image);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(55);
    }
}