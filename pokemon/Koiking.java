import java.math.*;

public class Koiking extends Pokemon{
    public Koiking(String name){
        super(name, 45, "Water", "Koiking.jpg");
    }

    public Koiking(String name, int maxHp, String type, String image){
        super(name, maxHp, type, image);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + getName() + " attack " + enemy.getName());
        enemy.damage(35);
    }
}