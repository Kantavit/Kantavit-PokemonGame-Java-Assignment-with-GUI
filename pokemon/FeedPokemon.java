import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FeedPokemon extends JFrame{
    private ArrayList<Pokemon> pokemon;
    private ArrayList<Berry> berry;

    public FeedPokemon(ArrayList<Pokemon> pokemon, ArrayList<Berry> berry){
        super("Choose Berry");
        this.pokemon = pokemon;
        this.berry = berry;

        Container c = getContentPane();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));

        try{
            int i = 0;
            for(i = 0; i < berry.size(); i++){ 
                JLabel berryName = new JLabel("Name: " + berry.get(i).getName());
                JLabel berryHeal = new JLabel("Heal: " + berry.get(i).getHealPoints());
                JLabel blank = new JLabel("     ");

                ImageIcon image = new ImageIcon(berry.get(i).getIMAGE());
                Image img = image.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
                ImageIcon berryImg = new ImageIcon(img);

                p1.add(berryName);
                p1.add(berryHeal);

                p3.add(new JLabel(berryImg));
            }

            JButton chooseButton1 = new JButton("Choose");
            JButton chooseButton2 = new JButton("Choose");
            p2.add(chooseButton1);
            p2.add(new JLabel("     "));
            p2.add(chooseButton2);

            c.add(p3, BorderLayout.WEST);
            c.add(p1, BorderLayout.CENTER);
            c.add(p2, BorderLayout.EAST);

            chooseButton1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ChoosePokemonToFeed cpf1 = new ChoosePokemonToFeed(pokemon, berry.get(0));
                    berry.remove(berry.get(0));
                }
            });

            chooseButton2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ChoosePokemonToFeed cpf2 = new ChoosePokemonToFeed(pokemon, berry.get(1));
                    berry.remove(berry.get(1));
                }
            });

        }catch(java.lang.IndexOutOfBoundsException exception){
            System.out.println("There's no berry in your bag !");
            System.out.println("Index Out Of Bounds Exception (ERROR)");
        }catch(java.lang.NullPointerException exception){
            System.out.println("Null Pointer Exception (ERROR)");
        }

        setSize(275, 120);
        setLocationRelativeTo(c);
        setVisible(true);
    }
}