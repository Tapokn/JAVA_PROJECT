package pack4_0;

public class Main {
    public static void main(String[] args) {
        Level level = Level.LOW;
        Level level1 = Level.HIGH;

        if (level == level1) {
            System.out.println("равны");
        } else {
            System.out.println("НЕ РАВНЫ");
        }

        System.out.println("level = " + level);
        System.out.println("level1 = " + level1);
        System.out.println("Код level: " + level.getLevel_inc());
        System.out.println("Код level1: " + level1.getLevel_inc());

        System.out.println("\nВсе значения Level:");
        for (Level l : Level.values()) {
            System.out.println(l + " -> код: " + l.getLevel_inc());
        }

        Level fromString = Level.valueOf("MEDIUM");
        System.out.println("\nvalueOf(\"MEDIUM\") = " + fromString);
        System.out.println("Код: " + fromString.getLevel_inc());
    }
}