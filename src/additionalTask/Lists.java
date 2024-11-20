package additionalTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lists {

    public static final int CAPACITY = 10_000_000;
    public static final int MIDDLE_ELEMENT = CAPACITY / 2;

    public static List<Long> ARRAY_LIST = new ArrayList<>(CAPACITY);
    public static List<Long> LINK_LIST = new LinkedList<>();

    static {
        System.out.println("Идет заполнение коллекций...");
        Random random = new Random();
        for (int i = 0; i < CAPACITY; i++) {
            ARRAY_LIST.add(random.nextLong());
            LINK_LIST.add(random.nextLong());
        }
    }
}
