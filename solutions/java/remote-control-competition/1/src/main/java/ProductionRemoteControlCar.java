class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int totalDistance = 0;
    private int totalVictories = 0;

    public void drive() {
        this.totalDistance += 10;
    }

    public int getDistanceTravelled() {
        return this.totalDistance;
    }


    public int getNumberOfVictories() {
        return this.totalVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return other.totalVictories - this.totalVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.totalVictories += numberOfVictories;
    }
}
