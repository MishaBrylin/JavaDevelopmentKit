package HW05;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThePhilosopher pythagoras = new ThePhilosopher("Пифагор", 400);
        ThePhilosopher heraclitus = new ThePhilosopher("Гераклид", 2000);
        ThePhilosopher diogenes = new ThePhilosopher("Диоген", 6000);
        ThePhilosopher socrates = new ThePhilosopher("Сократ", 700);
        ThePhilosopher plato = new ThePhilosopher("Платон", 8000);

        pythagoras.start();
        heraclitus.start();
        diogenes.start();
        socrates.start();
        plato.start();


    }

}
