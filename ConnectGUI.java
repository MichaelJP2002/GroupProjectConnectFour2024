import java.awt.Graphics;
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





        for(int y = 0; y <= 7; y++) {
            for (int x = 0; x <= 7; x++) {

                if((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
                    graphics2D.setColor(new Color(0, 125, 200));
                }

                else {
                    graphics2D.setColor(new Color(0, 125, 200));
                }
                graphics2D.fillRect(x * ConnectFour.TILE_SIZE, y * ConnectFour.TILE_SIZE, ConnectFour.TILE_SIZE, ConnectFour.TILE_SIZE);



                }



            }
        }
    }
