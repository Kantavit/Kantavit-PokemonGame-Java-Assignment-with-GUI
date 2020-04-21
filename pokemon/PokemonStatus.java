import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame{
    Pokemon pokemon;
    public PokemonStatus(Pokemon pokemon){
        super("Pokemon Status: " + pokemon.getName());
        this.pokemon = pokemon;

        Container c = getContentPane();
        JLabel name = new JLabel("Name: " + pokemon.getName());
        JLabel hp = new JLabel("HP: " + pokemon.getHp());
        JLabel type = new JLabel("Type: " + pokemon.getType());
        JLabel gender = new JLabel("Gender: " + pokemon.getGender());

        c.add(name);
        c.add(hp);
        c.add(type);
        c.add(gender);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

}