package pack4_1;

public class Motherboard {
    private String model;
    private String socket;
    private String formFactor;
    private String memoryType;

    public Motherboard(String model, String socket, String formFactor, String memoryType) {
        this.model = model;
        this.socket = socket;
        this.formFactor = formFactor;
        this.memoryType = memoryType;
    }

    public String getModel() { return model; }
    public String getSocket() { return socket; }
    public String getFormFactor() { return formFactor; }
    public String getMemoryType() { return memoryType; }

    @Override
    public String toString() {
        return model + " [Сокет: " + socket + ", Форм-фактор: " + formFactor + ", Память: " + memoryType + "]";
    }
}