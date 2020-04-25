import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PokemonStatus extends JFrame{
    private ArrayList<Pokemon> pokemon;

    public PokemonStatus(ArrayList<Pokemon> pokemon){
        super("Pokemon Status");
        this.pokemon = pokemon;

        Container c = getContentPane();

        int i = 0;
        for(i = 0; i < pokemon.size(); i++){
            JLabel name = new JLabel("Name: " + pokemon.get(i).getName());
            JLabel hp = new JLabel("HP: " + pokemon.get(i).getHp());
            JLabel type = new JLabel("Type: " + pokemon.get(i).getType());
            JLabel gender = new JLabel("Gender: " + pokemon.get(i).getGender());

            ImageIcon image = new ImageIcon(pokemon.get(i).getIMAGE());
            Image img = image.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newImg = new ImageIcon(img);
            JLabel pokeImage = new JLabel(newImg);

            c.add(pokeImage);
            c.add(name);
            c.add(hp);
            c.add(type);
            c.add(gender);
        }

        JButton rename1 = new JButton("Rename " + pokemon.get(0).getName());
        c.add(rename1);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        rename1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                RenamePokemon rp = new RenamePokemon(pokemon.get(0));
            }
        });

        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        setVisible(true);
    }
}