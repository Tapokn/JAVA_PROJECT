package pack4_1;

public class Case {
    private String model;
    private String supportedFormFactor;
    private int maxGpuLengthMm;

    public Case(String model, String supportedFormFactor, int maxGpuLengthMm) {
        this.model = model;
        this.supportedFormFactor = supportedFormFactor;
        this.maxGpuLengthMm = maxGpuLengthMm;
    }

    public String getModel() { return model; }
    public String getSupportedFormFactor() { return supportedFormFactor; }
    public int getMaxGpuLengthMm() { return maxGpuLengthMm; }

    @Override
    public String toString() {
        return model + " [Форм-фактор: " + supportedFormFactor + ", макс. GPU: " + maxGpuLengthMm + "мм]";
    }
}