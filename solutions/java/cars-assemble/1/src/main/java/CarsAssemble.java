public class CarsAssemble {
    
    public double productionRatePerHour(int speed) {
        double multiplyFactor = 0.0;
        
        if (0 <= speed && speed < 5) {
            multiplyFactor = 1.00;
        } else if (5 <= speed &&  speed < 9) {
            multiplyFactor = 0.90;
        } else if (9 == speed) {
            multiplyFactor = 0.80;
        } else if ( 10 == speed) {
            multiplyFactor = 0.77;
        }
        return speed * 221 * multiplyFactor;
    }

    public int workingItemsPerMinute(int speed) {
        double workingItemsPerHour = productionRatePerHour(speed);
        return (int) (workingItemsPerHour / 60);
    }
}
