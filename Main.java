import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("CHESS GAME");
        frame.getContentPane().setBackground(Color.black);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.ORANGE));
        // Size our board
        frame.setMinimumSize(new Dimension(900,900));
        // Grid
        frame.setLayout(new GridBagLayout());
        //
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make board visible
        //frame.setVisible(true);














    }
}
