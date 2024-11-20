package task1;

import java.util.*;

public class App1 {
    public static void main(String[] args) {

        List<String> words = List.of("Бурундук",
                "Алгебра", "Возня", "Корабль", "Бурундук",
                "Грива", "Смелый", "Бурундук", "Вечер",
                "Корабль", "Колоритный", "Монтаж",
                "Алгебра", "Компас", "Вечер", "Ходули",
                "Бритва", "Монтаж", "Зрелище", "Автор");

        System.out.println(new TreeSet<>(words));
        System.out.println("\nКоличество дубликатов каждого элемента: ");

        Map<String, Integer> map = new TreeMap<>();
        words.forEach(o -> map.put(o, Collections.frequency(words, o)));

        System.out.println(map);
    }
}

