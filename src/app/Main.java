package app;

public class Main {
    public static void main(String[] arg) {
        String[] fruits = new String[]{"fruits", "fruits", "fruits", "fruits"};
        String[] vegetables = new String[]{"vegetables", "vegetables", "vegetables", "vegetables"};

        MyTread fruitTread = new MyTread("fruitTread", fruits,1000);
        MyTread vegetableTrad = new MyTread("vegetableTrad", vegetables,1);


        fruitTread.start();
        vegetableTrad.start();


    }
}
