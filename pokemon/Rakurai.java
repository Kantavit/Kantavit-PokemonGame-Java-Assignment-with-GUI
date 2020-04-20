import java.math.*;

public class Rakurai extends Pokemon{
    public Rakurai(String name){
        super(name, 50, "Electric");
    }

    public Rakurai(String name, int maxHp, String type){
        super(name, maxHp, type);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(60);
    }
}