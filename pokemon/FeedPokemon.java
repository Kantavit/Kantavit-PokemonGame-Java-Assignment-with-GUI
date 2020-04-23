import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FeedPokemon extends JFrame{
    ArrayList<Berry> berry;

    private String[] name;
    private int[] healPoints;
    private String[] image;

    public FeedPokemon(ArrayList<Berry> berry){
        super("Feed Pokemon");
        this.berry = berry;

        Container c = getContentPane();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));

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

        JButton feedButton1 = new JButton("Feed");
        JButton feedButton2 = new JButton("Feed");
        p2.add(feedButton1);
        p2.add(new JLabel("     "));
        p2.add(feedButton2);

        c.add(p3, BorderLayout.WEST);
        c.add(p1, BorderLayout.CENTER);
        c.add(p2, BorderLayout.EAST);

        feedButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // healing(pokemon, 20);
            }
        });

        feedButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // healing(pokemon, 30);
            }
        });

        pack();
        // setSize(400, 400);
        setVisible(true);
    }
}