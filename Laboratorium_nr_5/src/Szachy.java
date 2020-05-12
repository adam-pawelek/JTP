import javax.swing.*;
import java.awt.*;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;


public class Szachy extends JFrame{
    public static void main(String[] args) {
        Szachy szachy = new Szachy();
        szachy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        szachy.setSize(600,600);

        Plansza plansza = new Plansza();
        // kwadrat.setPreferredSize(new Dimension(400,400));
        szachy.add(plansza);



        szachy.setVisible(true);

        System.out.println(szachy.getSize());




    }
}
