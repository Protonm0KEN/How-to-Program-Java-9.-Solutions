package Exercise8_10;

public enum TrafficLight {
    RED(10),
    GREEN(15),
    YELLOW(20);

    private final int durationSeconds;


    TrafficLight(int durationSeconds){
        this.durationSeconds = durationSeconds;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }
}
