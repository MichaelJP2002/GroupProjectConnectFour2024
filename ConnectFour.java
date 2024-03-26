import javax.swing.*;
import java.awt.*;



public class ConnectFour {


    public static final int BOARD_SIZE = 555, TILE_SIZE = BOARD_SIZE / 8;
    public static int numberOfMoves = 0;
    public static ConnectGUI board;


    public static void main (String [] args) {




        for(int x = 0; x <= 7; x++) {

        }

        JFrame frame = new JFrame("CONNECT FOUR");
        frame.getContentPane().setBackground(new Color(200,200,200));
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.BLACK));

        frame.setMinimumSize(new Dimension(900,900));

        frame.setLayout(new GridBagLayout());

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(panel);


        board = new ConnectGUI();


        frame.add(board);
        frame.pack();

        frame.setVisible(true);

    }
}
