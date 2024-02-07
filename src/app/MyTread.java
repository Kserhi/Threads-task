package app;

public class MyTread extends Thread {
    private final String[] products;
    private final int time;

    public MyTread(String name, String[] products,int time) {
        super(name);
        this.time=time;
        this.products = products;

    }

    public void run() {
        try {
            System.out.println("Start work: "+getName());
            Thread.sleep(time);
            for (String product : products) {
                System.out.println(product);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }

    }
}
