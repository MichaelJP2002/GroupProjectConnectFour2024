import javax.swing.*;
import java.awt.*;



public class ConnectFour {

    //55
    public static final int BOARD_SIZE = 355, TILE_SIZE = BOARD_SIZE / 8;
    public static int numberOfMoves = 0;
    public static ConnectGUI board;
  // public static Player player = new Player();
   // public static Piece [][] position = new Piece[8][8];


    public static void main (String [] args) {
//Setting White and Black Pieces Positions.
        // Draw pieces in appropriate starting positions.
        // Black Rooks


        //Add Pawn Black and White
        for(int x = 0; x <= 7; x++) {

        }
        // Start making board
        JFrame frame = new JFrame("CONNECT FOUR");
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

        board = new ConnectGUI();

        // board = new boardComponent();
       // BoardMouseListener boardMouse  = new BoardMouseListener();
      //  board.addMouseListener(boardMouse);
        frame.add(board);
        frame.pack();
        // Make the board visible
        frame.setVisible(true);

    }
}
