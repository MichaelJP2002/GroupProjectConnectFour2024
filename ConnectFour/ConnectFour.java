package ConnectFour;

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




        JPanel panel;
        JButton placePiece1;
        JButton placePiece2;
        JButton placePiece3;
        JButton placePiece4;
        JButton placePiece5;
        JButton placePiece6;
        JButton placePiece7;





        placePiece1 = new JButton("1");
        placePiece2 = new JButton("2");
        placePiece3 = new JButton("3");
        placePiece4 = new JButton("4");
        placePiece5 = new JButton("5");
        placePiece6 = new JButton("6");
        placePiece7 = new JButton("7");

        placePiece1.setBounds(1,1,300,300);
        placePiece1.setBounds(1,1,300,300);


        panel = new JPanel();
        //panel.setBounds(1,1,300,300);
       // panel.setLayout(new GridLayout(1,1,1,1));
        panel.setBackground(Color.BLACK);


        panel.add(placePiece1);
        panel.add(placePiece2);
        panel.add(placePiece3);
        panel.add(placePiece4);
        panel.add(placePiece5);
        panel.add(placePiece6);
        panel.add(placePiece7);



        frame.add(panel);










        board = new ConnectGUI();


        frame.add(board);
        frame.pack();

        frame.setVisible(true);

    }
}
