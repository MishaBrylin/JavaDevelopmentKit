package HW06;



import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int totalSteps = 100000; // Общее количество шагов цикла

        // Переменные для подсчета позитивных и негативных результатов
        int positiveResults = 0;
        int negativeResults = 0;

        // Хранение результатов - шаг цикла -> результат
        HashMap<Integer, Boolean> results = new HashMap<>();

        Random random = new Random();

        // Цикл для моделирования игры Монти Холла
        for (int step = 1; step <= totalSteps; step++) {
            // Игровое поле с тремя дверями
            boolean[] doors = {false, false, false};

            // Рандомно выбираем, за какой дверью будет автомобиль
            int carDoor = random.nextInt(3);
            doors[carDoor] = true;

            // Игрок выбирает дверь
            int playerChoice = random.nextInt(3);

            // Ведущий открывает одну из оставшихся дверей с козой
            int openedDoor;
            do {
                openedDoor = random.nextInt(3);
            } while (openedDoor == playerChoice || doors[openedDoor]);

            // Игрок делает выбор еще раз
            int playerNewChoice;
            do {
                playerNewChoice = random.nextInt(3);
            } while (playerNewChoice == playerChoice || playerNewChoice == openedDoor);

            // Проверяем результаты и обновляем статистику
            boolean win = doors[playerNewChoice];
            results.put(step, win);
            if (win) {
                positiveResults++;
            } else {
                negativeResults++;
            }
        }

        // Выводим статистику
        System.out.println("Количество позитивных результатов: " + positiveResults);
        System.out.println("Количество негативных результатов: " + negativeResults);
        System.out.println("Процент позитивных результатов: " + (double)positiveResults / totalSteps * 100 + "%");
    }
}