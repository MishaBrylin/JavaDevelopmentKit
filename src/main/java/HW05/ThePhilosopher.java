package HW05;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThePhilosopher extends Thread {

    private String name;
    private int thinks;
    private int eating = 0;

    private static AtomicBoolean table;


    public ThePhilosopher(String name, int thinks, AtomicBoolean table) {
        this.name = name;
        this.thinks = thinks;
        this.table = table;


    }
    @Override
    public void run() {
        while (true) {

            if (table.get() == true){

            System.out.println(name + " ест");
            table = new AtomicBoolean(false);
            try {
                Thread.sleep(500);
                table = new AtomicBoolean(true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            eating++;
            if (eating == 3) {
                System.out.println(name + " наелся");
                break;
            }
            }
            System.out.println(name + " размышляет");
            try {
                Thread.sleep(thinks);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }




}
