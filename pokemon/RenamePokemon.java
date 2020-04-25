import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RenamePokemon extends JFrame{
    private JTextField textField;
    private Pokemon pokemon;

    public RenamePokemon(Pokemon pokemon){
        super("Rename Pokemon");
        this.pokemon = pokemon;

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel("Rename Pokemon:");
        textField = new JTextField(25); // 25 chars wide
        JLabel info = new JLabel("press 'ENTER' to confirm");
        c.add(label);
        c.add(textField);
        c.add(info);

        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("You rename " + pokemon.getName() + " to " + e.getActionCommand());
                textField.setText("");
                pokemon.setName(e.getActionCommand());
            }
        });

        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setVisible(true);
    }
}