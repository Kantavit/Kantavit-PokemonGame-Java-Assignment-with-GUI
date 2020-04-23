import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BerryIndex extends JFrame{
    private ArrayList<Berry> berry;

    public BerryIndex(ArrayList<Berry> berry){
        super("All Berry Index");
        this.berry = berry;

        setBounds(100, 100, 432, 150);
        JPanel panel = new JPanel();

        int i = 0;
        for(i = 0; i < berry.size(); i++){
            ImageIcon image = new ImageIcon(berry.get(i).getIMAGE());
            Image img = image.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
            ImageIcon berryImg = new ImageIcon(img);

            panel.add(new JLabel(berryImg));
            panel.add(new JLabel("Name: " + berry.get(i).getName()));
            panel.add(new JLabel(", Heal: " + berry.get(i).getHealPoints()));
            panel.add(new JLabel("     "));
        }

        JScrollPane scroll = new JScrollPane(panel);
        getContentPane().add(scroll, BorderLayout.CENTER);
        setVisible(true);
    }
}