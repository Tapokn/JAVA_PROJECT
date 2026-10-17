package pack4_1;

public class GraphicsCard {
    private String model;
    private int vramGb;
    private int lengthMm;

    public GraphicsCard(String model, int vramGb, int lengthMm) {
        this.model = model;
        this.vramGb = vramGb;
        this.lengthMm = lengthMm;
    }

    public String getModel() { return model; }
    public int getVramGb() { return vramGb; }
    public int getLengthMm() { return lengthMm; }

    @Override
    public String toString() {
        return model + " (" + vramGb + "GB, длина: " + lengthMm + "мм)";
    }
}