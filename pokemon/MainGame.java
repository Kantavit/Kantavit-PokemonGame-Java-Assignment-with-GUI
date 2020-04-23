import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainGame extends JFrame{
    private Trainer trainer;

    public MainGame(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;

        Container c = getContentPane();
        JLabel trainerNameLabel = new JLabel("Player: " + this.trainer.getName());
        JLabel pokemonName = new JLabel();

        JButton firstPokemon = new JButton(trainer.getBagOfPokemon().get(0).getName() + " Status");
        JButton feedPokemon = new JButton("Feed pokemon");
        JButton pokemonIndex = new JButton("All Pokemon Data in game");
        JButton berryIndex = new JButton("All Berry Data in game");

        JLabel separator = new JLabel("____________________________________________");
        JLabel blank = new JLabel(" ");

        c.add(trainerNameLabel);
        c.add(pokemonName);
        c.add(firstPokemon);
        c.add(feedPokemon);
        c.add(separator);
        c.add(blank);
        c.add(pokemonIndex); 
        c.add(berryIndex);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        String pokeName = "Pokemon: ";
        for(Pokemon p: trainer.getBagOfPokemon()){
            pokeName += p.getName() + ", ";
        }
        pokemonName.setText(pokeName);

        firstPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                PokemonStatus ps = new PokemonStatus(trainer.getBagOfPokemon().get(0));
            }
        });

        feedPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                FeedPokemon fp = new FeedPokemon(trainer.getBagOfBerry());
            }
        });

        pokemonIndex.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                PokemonIndex pi = new PokemonIndex(trainer.getAllPokemonInGame());
            }
        });

        berryIndex.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                BerryIndex bi = new BerryIndex(trainer.getAllBerryInGame());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 225);
        setVisible(true);

    }
}