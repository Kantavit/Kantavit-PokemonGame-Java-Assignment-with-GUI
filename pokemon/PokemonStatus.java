import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame{
    private Pokemon pokemon;

    public PokemonStatus(Pokemon pokemon){
        super("Pokemon Status: " + pokemon.getName());
        this.pokemon = pokemon;

        Container c = getContentPane();
        JLabel name = new JLabel("Name: " + pokemon.getName());
        JLabel hp = new JLabel("HP: " + pokemon.getHp());
        JLabel type = new JLabel("Type: " + pokemon.getType());
        JLabel gender = new JLabel("Gender: " + pokemon.getGender());

        ImageIcon image = new ImageIcon(pokemon.getIMAGE());
        Image img = image.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newImg = new ImageIcon(img);
        JLabel pokeImage = new JLabel(newImg);

        c.add(pokeImage);
        c.add(name);
        c.add(hp);
        c.add(type);
        c.add(gender);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        setVisible(true);
    }
}