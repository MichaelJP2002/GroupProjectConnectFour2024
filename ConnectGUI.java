import javax.swing.*;
import java.awt.*;

public class ConnectGUI extends JComponent {

    int column = 8;
    int row = 8;

    public ConnectGUI() {
        this.setPreferredSize(new Dimension(column*ConnectFour.TILE_SIZE, row*ConnectFour.TILE_SIZE));
    }

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        // Nested for loop to track x and y position.
        for(int y = 0; y <= 7; y++) {
            for (int x = 0; x <= 7; x++) {
                // If both x AND y are even, OR x AND y are odd, paint the lighter rectangle.
                if((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
                    graphics2D.setColor(new Color(0, 0, 255));
                }
                // Otherwise, paint the darker rectangle.
                else {
                    graphics2D.setColor(new Color(0, 0, 255));
                }
                graphics2D.fillRect(x * ConnectFour.TILE_SIZE, y * ConnectFour.TILE_SIZE, ConnectFour.TILE_SIZE, ConnectFour.TILE_SIZE);
                // If the position within the array is NOT null, run method drawPiece within the Piece class.
               // if(Chess.position[x][y] != null) {
                   // Chess.position[x][y].drawPiece(x * 44, y * 44, graphics);
                    //System.out.println(Chess.position[x][y].PieceType);
                }
            }
        }
    }
