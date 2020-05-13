import javax.swing.*;
import java.awt.*;

public class Kwadrat extends JPanel {
    Dimension r;

    public Kwadrat (Dimension r){
        this.r = r;
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLUE);



        //lewa gora
        g.setColor(Color.RED);
        g.fillRect(0,0,this.getHeight() / 4,this.getHeight() / 4);
        //lewy dol
        g.setColor(Color.WHITE);
        g.fillRect(0,this.getHeight()/4,this.getHeight() / 4,this.getHeight() / 4);
        //prawa gora
        g.setColor(Color.WHITE);
        g.fillRect(this.getHeight()/4,0,this.getHeight() / 4,this.getHeight() / 4);
        //prawy dol
        g.setColor(Color.RED);
        g.fillRect(this.getHeight()/4,this.getHeight()/4,this.getHeight() / 4,this.getHeight() / 4);

        System.out.println(this.getSize());



        g.setColor(Color.WHITE);
        g.fillRect(this.getWidth()*3/4,0,this.getWidth(),this.getHeight() / 8);

        g.setColor(Color.RED);
        g.fillRect(this.getWidth()*3/4,this.getHeight() / 8,this.getWidth(),this.getHeight() /8);

        g.drawString("Polska",this.getWidth()*3/4,this.getHeight()*2/5);




        g.drawString("Polska",this.getHeight()/4,this.getHeight()*3/4);

    }
}
