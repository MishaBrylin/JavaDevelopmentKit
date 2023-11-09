package HW05;

public class ThePhilosopher extends Thread {

    private String name;
    private int thinks;
    private int eating = 0;


    public ThePhilosopher(String name, int thinks) {
        this.name = name;
        this.thinks = thinks;

    }
    @Override
    public void run() {
        while (true) {

            System.out.println(name + " ест");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            eating++;
            if (eating == 3) {
                System.out.println(name + " наелся");
                break;
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
