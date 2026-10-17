package pack4_1;

public enum Brand {
    ASUS("Тайвань"),
    LENOVO("Китай"),
    APPLE("США"),
    HP("США"),
    DELL("США");

    private final String country;

    Brand(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}