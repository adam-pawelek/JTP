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
        //podpunkt1
        try {
            System.out.println(factorial(-1));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        //podpunkt2
        try {
            System.out.println(factorial1(-1));
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }




    }



}
