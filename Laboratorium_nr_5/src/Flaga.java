import javax.swing.*;
import java.awt.*;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;


public class Flaga extends JFrame {


    public Flaga(){

        setTitle("Flaga");
    }





    public static void main(String[] args) {
        Flaga flaga = new Flaga();
        flaga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension r = flaga.getSize();

        Kwadrat kwadrat = new Kwadrat(r);
       // kwadrat.setPreferredSize(new Dimension(400,400));
        flaga.add(kwadrat);


        flaga.setSize(300,300);
        flaga.setVisible(true);

        System.out.println(flaga.getSize());






    }
}
