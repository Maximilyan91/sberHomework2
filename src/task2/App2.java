package task2;

public class App2 {
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.add("Пупкин", "+788832531");
        book.add("Пупкин", "+788832531");
        book.add("Пупкин", "89424223899");
        book.add("Онегин", "+7546598658");
        book.add("Онегин", "+423232544");
        book.add("Пупкин", "+5642345");
        book.add("Леший", "+79992341509");
        book.add("Пупкин", "+78883552531");

        System.out.println(book);
    }
}
