import java.io.*;

public class Factorial {

    public static int factorial(int x) throws Exception{
        if (x < 0){
            throw new Exception("x < 0");
        }
        int wyn = 1;
        for(int i = 0; i < x; i++){
            wyn *= (i+1);
        }
        return wyn;
    }


    public static int factorial1(int x) throws MyException{
        if (x < 0){
            MyException myException = new MyException("factorial1 x < 0");
            throw myException;
        }
        int wyn = 1;
        for(int i = 0; i < x; i++){
            wyn *= (i+1);
        }
        return wyn;
    }


    public static void main(String[] args) {
        int tab[] = {-3,-1,0,1,2,4,5};

        //podpunkt1
        for (int i = 0; i < 7; i++) {
            System.out.println("Nowa linia "  + tab[i]);

            try {
                System.out.println(factorial(tab[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            //podpunkt2
            try {
                System.out.println(factorial1(tab[i]));
            } catch (MyException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }



    }



}
