public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int totalDistance = 0;

    public void drive() {
        this.totalDistance += 20;
    }

    public int getDistanceTravelled() {
        return this.totalDistance;
    }
}