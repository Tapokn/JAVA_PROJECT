package pack4_0;

public enum Level {
    HIGH(3),
    LOW(1),
    MEDIUM(2);

    private final int level_inc;

    Level(int level_inc) {
        this.level_inc = level_inc;
    }

    public int getLevel_inc() {
        return level_inc;
    }
}