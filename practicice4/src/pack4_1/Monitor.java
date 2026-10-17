package pack4_1;

public class Monitor {
    private double diagonal;
    private String resolution;

    public Monitor(double diagonal, String resolution) {
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return diagonal + "\" " + resolution;
    }
}