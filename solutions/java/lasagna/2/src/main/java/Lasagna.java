public class Lasagna {
    private static final int EXPECTED_TIME_IN_OVEN = 40;
    private static final int PREP_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_TIME_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int time) {
        return EXPECTED_TIME_IN_OVEN - time;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return PREP_TIME_PER_LAYER * layers;
    }
    
    public int totalTimeInMinutes(int layers, int time) {
        return PREP_TIME_PER_LAYER * layers + time;
    }
}
