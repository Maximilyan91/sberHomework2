package task2;

import java.util.*;

public class PhoneBook {

    private final Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public void add(String name, String phoneNumber) {

        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new TreeSet<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    public Set<String> get(String name) {
        return phoneBook.getOrDefault(name, Collections.emptySet());
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
