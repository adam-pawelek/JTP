import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static java.lang.Character.getDirectionality;

public class Plansza extends JPanel implements MouseListener {
    int czy = 0;
    int x,y;
    ArrayList <Kafelki>  tablica = new ArrayList<>();
    String ktore_pole = new String("Numer pola:");

    public Plansza(){
        addMouseListener(this);




    }




    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (czy == 1) {
         //   this.setBackground(Color.BLUE);
        }

        //tworzenie tablicy
        tablica.clear();
        Kafelki pom;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                pom = new Kafelki(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight()/ 9 * (j + 1),this.getHeight() / 9 * (i + 1),
                        8-i, (char) (97 + j));
                tablica.add(pom);

            }

        }
        //poczatek programu





        int ktory = 1;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (ktory == 0){
                    g.setColor(Color.black);
                }
                else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight() / 9 ,this.getHeight() / 9);
                ktory = (ktory + 1) % 2;
            }
            ktory = (ktory + 1) % 2;
        }

        for (int i = 0; i < 8; i++){
            g.setColor(Color.black);
            char dochar = (char)(97 + i);
            String wloz = new String();
            wloz += dochar;
            g.drawString(wloz , this.getHeight() / 9 * i, this.getHeight() * 9 / 10);
        }

        for (int i = 8; i > 0; i--){
            g.setColor(Color.black);
            char dochar = (char)(57 - i);
            String wloz = new String();
            wloz += dochar;
            g.drawString(wloz , this.getHeight() * 9 / 10,this.getHeight() / 9 * i);
        }

        g.setColor(Color.black);
        g.drawString(ktore_pole , 0,this.getHeight()* 15/16);



    }




    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        czy = 1;
        x =  mouseEvent.getX();
        y = mouseEvent.getY();
        System.out.println(x + " " + y);
        for (Kafelki k: tablica){
         //   System.out.println(k.od_x + " " + k.od_y + " " + k.do_x + " " + k.do_y + "\n");
            if (k.od_x < x && k.do_x > x && k.od_y < y && k.do_y > y){
                ktore_pole = k.toString();
            }
        }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
