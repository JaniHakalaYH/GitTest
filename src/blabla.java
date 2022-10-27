import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class blabla extends JFrame implements MouseListener {

    JButton button = new JButton();
    JButton button2 = new JButton();
    JPanel panel = new JPanel();

    JPanel panelTest = new JPanel();
    JButton buttonTest = new JButton();
    blabla(){
        add(panel);
        panel.add(button);

        button.setText("Vilken pokemon?");
        button.addMouseListener(this);
        button.setVisible(true);

        button2.setText("Vilken pokemon?");
        button2.addMouseListener(this);
        button2.setVisible(false);

        setLocationRelativeTo(null);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (button.isVisible()){
            button.setVisible(false);
            button2.setVisible(true);
        }else if (button2.isVisible()){
            button2.setVisible(false);
            button.setVisible(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
