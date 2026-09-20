package pack1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    // Сеттер только для email — имя и пол по условию неизменяемы,
    // поэтому для них сеттеров нет.
    public void setEmail(String email) {
        this.email = email;
    }

    // Переопределяем Object.toString(), иначе println напечатал бы
    // author_pr2.Author@1b6d3586 — хеш адреса объекта.
    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}