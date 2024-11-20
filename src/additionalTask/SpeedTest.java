package additionalTask;

import java.util.List;

public class SpeedTest {

    public static void findIndex(List<Long> list, int index) {
        long averageResult = 0;

        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            list.get(index);
            long end = System.nanoTime();
            long result = end - start;

            if (i > 4) {
                averageResult += result;
            }
        }
        averageResult /= 5;
        System.out.println("---------- Поиск элемента в " +
                list.getClass().getSimpleName() + " ----------" +
                "\nСреднее время за последние 5 проходов цикла: " + averageResult);
    }

    public static void findAdd(List<Long> list, int index) {
        long averageResult = 0;

        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            list.add(index, 546453677657L);
            long end = System.nanoTime();
            long result = end - start;

            if (i > 4) {
                averageResult += result;
            }
        }
        averageResult /= 5;
        System.out.println("---------- Добавление элемента в " +
                list.getClass().getSimpleName() + " ----------" +
                "\nСреднее время за последние 5 проходов цикла: " + averageResult);
    }
}
