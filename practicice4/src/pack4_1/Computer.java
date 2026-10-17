package pack4_1;

public class Computer {
    private Brand brand;
    private Processor processor;
    private Motherboard motherboard;
    private Memory memory;
    private GraphicsCard graphicsCard;
    private Case pcCase;
    private Monitor monitor;

    private boolean isCompatible;

    // Статическое поле - счетчик всех созданных компьютеров
    private static int totalComputers = 0;

    public Computer(Brand brand, Processor processor, Motherboard motherboard,
                    Memory memory, GraphicsCard graphicsCard, Case pcCase, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.motherboard = motherboard;
        this.memory = memory;
        this.graphicsCard = graphicsCard;
        this.pcCase = pcCase;
        this.monitor = monitor;

        this.isCompatible = true;
        totalComputers++; // Увеличиваем счетчик при создании объекта
        checkCompatibility();
    }

    // Статический метод (доступ на уровне класса, без создания объекта)
    public static void printTotalCount() {
        System.out.println("Всего собрано конфигураций: " + totalComputers);
    }

    private void checkCompatibility() {
        switch (motherboard.getSocket()) {
            case "LGA1700":
                if (!processor.getSocket().equals("LGA1700")) isCompatible = false;
                break;
            case "AM5":
                if (!processor.getSocket().equals("AM5")) isCompatible = false;
                break;
            case "Apple Silicon":
                if (!processor.getSocket().equals("Apple Silicon")) isCompatible = false;
                break;
            default:
                isCompatible = false;
        }

        if (!motherboard.getMemoryType().equals(memory.getType()) && !motherboard.getMemoryType().equals("Unified")) {
            isCompatible = false;
        }

        if (!motherboard.getFormFactor().equals(pcCase.getSupportedFormFactor())) {
            isCompatible = false;
        }

        if (graphicsCard.getLengthMm() > pcCase.getMaxGpuLengthMm()) {
            isCompatible = false;
        }
    }

    public boolean isCompatible() { return isCompatible; }

    @Override
    public String toString() {
        String status = isCompatible ? "СБОРКА УСПЕШНА" : "СБОРКА НЕВОЗМОЖНА";
        String memInfo = (brand == Brand.APPLE) ? memory.getSizeGb() + "GB (распаяна)" : memory.toString();

        // Использование String.format для академичного вывода
        return String.format("=== %s (%s) ===\n" +
                        "Процессор: %s\n" +
                        "Плата: %s\n" +
                        "Память: %s\n" +
                        "Видеокарта: %s\n" +
                        "Корпус: %s\n" +
                        "Монитор: %s\n",
                status, brand, processor, motherboard, memInfo, graphicsCard, pcCase, monitor);
    }
}