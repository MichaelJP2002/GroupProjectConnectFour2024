package ConnectFour;

import ConnectFour.ConnectFour;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class ConnectGUI extends JComponent {





    int column = 8;
    int row = 8;

    public ConnectGUI() {
        this.setPreferredSize(new Dimension(column* ConnectFour.TILE_SIZE, row*ConnectFour.TILE_SIZE));
    }




    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;







        // Blue Board
        graphics.drawRect(0,0,1000,1000);
        graphics.setColor(new Color(0,125,200));
        graphics.fillRect(0,0,1000,1000);

        // Black circles
        for(int y= 0; y<=5; y++) {
            for (int x = 0; x <= 6; x++) {
                graphics.drawOval(x*ConnectFour.TILE_SIZE + 45, y * ConnectFour.TILE_SIZE + 45, 50, 50);
                graphics.setColor(Color.black);
                graphics.fillOval(x*ConnectFour.TILE_SIZE + 45, y * ConnectFour.TILE_SIZE + 45, 50, 50);

            }
        }











/*
        for(int y = 0; y <= 7; y++) {
            for (int x = 0; x <= 7; x++) {

               if((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
                    graphics2D.setColor(new Color(0, 0, 0));
                }

                else {
                    graphics2D.setColor(new Color(0, 0, 0));
                }
                graphics2D.fillRect(x * ConnectFour.ConnectFour.TILE_SIZE, y * ConnectFour.ConnectFour.TILE_SIZE, ConnectFour.ConnectFour.TILE_SIZE, ConnectFour.ConnectFour.TILE_SIZE);



                }
            }

 */
        }
    }
