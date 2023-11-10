package HW05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicBoolean table = new AtomicBoolean(true);
        ThePhilosopher pythagoras = new ThePhilosopher("Пифагор", 400, table);
        ThePhilosopher heraclitus = new ThePhilosopher("Гераклид", 2000, table);
        ThePhilosopher diogenes = new ThePhilosopher("Диоген", 6000, table);
        ThePhilosopher socrates = new ThePhilosopher("Сократ", 700, table);
        ThePhilosopher plato = new ThePhilosopher("Платон", 8000, table);


        pythagoras.start();
        heraclitus.start();
        diogenes.start();
        socrates.start();
        plato.start();


    }

}
