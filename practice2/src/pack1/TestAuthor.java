package pack1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        Author a2 = new Author("Sue Grant", "suGrant@somewhere.com", 'f');

        // println(Object) неявно вызывает toString() — печатается читаемая строка.
        System.out.println(a1);
        System.out.println(a2);

        // Проверяем геттеры по отдельности — задание требует проверки методов.
        System.out.println("Имя:   " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Пол:   " + a1.getGender());

        // Проверяем сеттер: меняем email и убеждаемся, что объект изменился.
        a1.setEmail("newTeck@mail.ru");
        System.out.println("После setEmail: " + a1);
    }
}