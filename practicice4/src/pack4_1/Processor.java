package pack4_1;

public class Processor {
    private String model;
    private int cores;
    private String socket;

    public Processor(String model, int cores, String socket) {
        this.model = model;
        this.cores = cores;
        this.socket = socket;
    }

    public String getModel() { return model; }
    public int getCores() { return cores; }
    public String getSocket() { return socket; }

    @Override
    public String toString() {
        return model + " (" + cores + " ядер, сокет: " + socket + ")";
    }
}