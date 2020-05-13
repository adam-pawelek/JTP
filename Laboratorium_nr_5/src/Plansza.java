import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static java.lang.Character.getDirectionality;

public class Plansza extends JPanel implements MouseListener {
    int czy = 0;
    int x,y;
    int sstart = 0;
    int przesun = 0;
    int xxx;
    int yyy;
    Kafelki pamietaj = new Kafelki();
    ArrayList <Kafelki>  tablica = new ArrayList<>();
    ArrayList<Kafelki>   czerwone  = new ArrayList<>();
    ArrayList<Kafelki>   niebieskie = new ArrayList<>();
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



        //tworzenie niebieskich
        //niebieskie.clear();
        //tablica
        if (sstart == 0){
            ktory = 1;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 8; j++){
                    if (ktory == 0){
                        pom = new Kafelki(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight()/ 9 * (j + 1),this.getHeight() / 9 * (i + 1),
                                8-i, (char) (97 + j), this.getHeight()/9, 0);
                        niebieskie.add(pom);
                    }


                    ktory = (ktory + 1) % 2;
                }
                ktory = (ktory + 1) % 2;
            }

        }

        for (Kafelki k: niebieskie){
            g.setColor(Color.BLUE);
            g.drawOval(k.od_x,k.od_y,k.dlugosc ,k.dlugosc);
            g.fillOval(k.od_x,k.od_y,k.dlugosc ,k.dlugosc);
        }


        /*
         ktory = 1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 8; j++){
                if (ktory == 0){
                    g.setColor(Color.BLUE);
                    g.drawOval(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight() / 9 ,this.getHeight() / 9);
                    g.fillOval(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight() / 9 ,this.getHeight() / 9);
                }
                else {
                    g.setColor(Color.RED);
                }

                ktory = (ktory + 1) % 2;
            }
            ktory = (ktory + 1) % 2;
        }
*/
        //tab czerwone
        if (sstart == 0){
            ktory = 1;
            for(int i = 5; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if (ktory == 1){
                        pom = new Kafelki(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight()/ 9 * (j + 1),this.getHeight() / 9 * (i + 1),
                                8-i, (char) (97 + j), this.getHeight()/9,1);
                        czerwone.add(pom);
                    }


                    ktory = (ktory + 1) % 2;
                }
                ktory = (ktory + 1) % 2;
            }
            sstart = 1;
        }
        for (Kafelki k: czerwone){
            g.setColor(Color.RED);
            g.drawOval(k.od_x,k.od_y,k.dlugosc ,k.dlugosc);
            g.fillOval(k.od_x,k.od_y,k.dlugosc ,k.dlugosc);
        }

        /*

        ktory = 1;
        //tworze czerwone
        for(int i = 5; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (ktory == 0){
                    g.setColor(Color.BLUE);

                }
                else {
                    g.setColor(Color.RED);
                    g.drawOval(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight() / 9 ,this.getHeight() / 9);
                    g.fillOval(this.getHeight()/ 9 * j,this.getHeight() / 9 * i,this.getHeight() / 9 ,this.getHeight() / 9);
                }

                ktory = (ktory + 1) % 2;
            }
            ktory = (ktory + 1) % 2;
        }
*/






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

        g.setColor(Color.orange);
        g.fillRect(this.getHeight()*10/11,this.getHeight() * 10/11 ,this.getHeight() ,this.getHeight());
        xxx= this.getHeight()*10/11;
        yyy = this.getHeight()*10/11;
        g.setColor(Color.black);
        g.drawString("zmien pionek" , this.getHeight() * 10/11 ,this.getHeight() * 20/21 );

    }




    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        czy = 1;
        Sprawdzaj sprawdzaj = new Sprawdzaj();
        x =  mouseEvent.getX();
        y = mouseEvent.getY();
        if (x > xxx & y > yyy){
            przesun = 0;
        }



        int byl = 0;
        int zeroj = 0;
        for (Kafelki k: tablica){
         //   System.out.println(k.od_x + " " + k.od_y + " " + k.do_x + " " + k.do_y + "\n");
            if (k.od_x < x && k.do_x > x && k.od_y < y && k.do_y > y){
                ktore_pole = k.toString();
                System.out.println(ktore_pole);
                byl = 1;
            }
        }




        if (przesun == 0){
            for (Kafelki k:czerwone){
                if (k.od_x < x && k.do_x > x && k.od_y < y && k.do_y > y){
                    przesun = 1;
                    pamietaj = k;
                  //  System.out.println("taak");
                }
            }
            for (Kafelki k:niebieskie){
                if (k.od_x < x && k.do_x > x && k.od_y < y && k.do_y > y){
                    przesun = 1;
                    pamietaj = k;
                  //  System.out.println("taak");
                }
            }

        }
        else if (byl == 1 && pamietaj.kolor == 1 && sprawdzaj.sprzeczne(niebieskie,czerwone,x,y)){
          //  System.out.println("www");
         //   System.out.println(x +" " + y);
          //  System.out.println(pamietaj.od_x +" "+ pamietaj.od_y +" "+pamietaj.do_x+" "+pamietaj.do_y);

            if (pamietaj.cruchp(x,y)){  //czerwnoe rcuh prawo
                czerwone.remove(pamietaj);
                pamietaj.dodaj(pamietaj.dlugosc,-pamietaj.dlugosc);
                czerwone.add(pamietaj);
                przesun = 0;
            }

            if (pamietaj.cruchl(x,y)){  //czerwnoe rcuh lewo
                czerwone.remove(pamietaj);
                pamietaj.dodaj(-pamietaj.dlugosc,-pamietaj.dlugosc);
                czerwone.add(pamietaj);
                przesun = 0;
            }
            zeroj = sprawdzaj.bijpc(niebieskie,czerwone,x,y,pamietaj);
            zeroj = sprawdzaj.bijlc(niebieskie,czerwone,x,y,pamietaj);

        }
        else if (byl == 1 && pamietaj.kolor == 0 && sprawdzaj.sprzeczne(niebieskie,czerwone,x,y)){
           // System.out.println("niebieski");
          //  System.out.println(x +" " + y);
           // System.out.println(pamietaj.od_x +" "+ pamietaj.od_y +" "+pamietaj.do_x+" "+pamietaj.do_y);

            if (pamietaj.nruchp(x,y)){  //niebieskiercuh prawo
                niebieskie.remove(pamietaj);
                pamietaj.dodaj(pamietaj.dlugosc,pamietaj.dlugosc);
                niebieskie.add(pamietaj);
                przesun = 0;
            }

            if (pamietaj.nruchl(x,y)){  //niebieskie rcuh lewo
                niebieskie.remove(pamietaj);
                pamietaj.dodaj(-pamietaj.dlugosc,pamietaj.dlugosc);
                niebieskie.add(pamietaj);
                przesun = 0;
            }
            zeroj = sprawdzaj.bijpn(niebieskie,czerwone,x,y,pamietaj);
            zeroj = sprawdzaj.bijln(niebieskie,czerwone,x,y,pamietaj);

        }

        if (zeroj == 1){
            przesun = 0;
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
