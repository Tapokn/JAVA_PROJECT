package pack4_1;

public class Main {
    public static void main(String[] args) {

        // 1. Создаем пул доступных комплектующих
        Processor[] cpus = {
                new Processor("Intel Core i9", 24, "LGA1700"),
                new Processor("AMD Ryzen 7", 8, "AM5")
        };
        Motherboard[] mbs = {
                new Motherboard("ASUS Z790", "LGA1700", "ATX", "DDR5"),
                new Motherboard("MSI B650", "AM5", "Micro-ATX", "DDR5")
        };
        Memory[] rams = {
                new Memory(32, "DDR5"),
                new Memory(16, "DDR4") // Несовместима с платами выше
        };
        GraphicsCard[] gpus = {
                new GraphicsCard("RTX 4070", 12, 280),
                new GraphicsCard("RTX 4090", 24, 336) // Длинная
        };
        Case[] cases = {
                new Case("Corsair 4000D", "ATX", 360),
                new Case("Cooler Master Q300L", "Micro-ATX", 320)
        };
        Monitor mon = new Monitor(27.0, "1440p");

        // 2. Демонстрация доступа к перечислению (классу, а не объекту)
        System.out.println("Доступные бренды (метод values()):");
        for (Brand b : Brand.values()) {
            System.out.print(b + " (" + b.getCountry() + "); ");
        }
        System.out.println("\n");

        // 3. Динамический подбор комплектующих через switch
        System.out.println("--- АНАЛИЗ СОВМЕСТИМОСТИ ДЛЯ " + mbs[0].getModel() + " ---");
        // Получаем сокет через геттер и выбираем нужный процессор из массива
        String targetSocket = mbs[0].getSocket();

        Processor matchedCpu = null;
        switch (targetSocket) {
            case "LGA1700":
                matchedCpu = cpus[0];
                break;
            case "AM5":
                matchedCpu = cpus[1];
                break;
            default:
                System.out.println("Неизвестный сокет.");
        }
        if (matchedCpu != null) {
            // Демонстрация доступа к полям объекта через геттеры
            System.out.println("Подходящий процессор: " + matchedCpu.getModel() + " (" + matchedCpu.getCores() + " ядер)");
        }
        System.out.println();

        // 4. Сборка (успешная и неуспешная) и вывод через цикл
        Computer[] pcs = {
                // Успешная: LGA1700, DDR5, ATX, GPU 280 < 360
                new Computer(Brand.ASUS, cpus[0], mbs[0], rams[0], gpus[0], cases[0], mon),
                // Неуспешная: AM5 плата + LGA1700 проц, DDR4 память, GPU 336 > 320 (Micro-ATX)
                new Computer(Brand.ASUS, cpus[0], mbs[1], rams[1], gpus[1], cases[1], mon)
        };

        System.out.println("--- РЕЗУЛЬТАТЫ СБОРОК ---");
        for (Computer pc : pcs) {
            System.out.println(pc);
            // Демонстрация доступа к булеву полю через геттер
            if (!pc.isCompatible()) {
                System.out.println("Примечание: обнаружены ошибки совместимости.\n");
            }
        }

        // 5. Вызов статического метода класса
        Computer.printTotalCount();
    }
}