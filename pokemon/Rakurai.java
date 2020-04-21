import java.math.*;

public class Rakurai extends Pokemon{
    public Rakurai(String name){
        super(name, 50, "Electric", "Rakurai.jpg");
    }

    public Rakurai(String name, int maxHp, String type, String image){
        super(name, maxHp, type, image);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(60);
    }
}