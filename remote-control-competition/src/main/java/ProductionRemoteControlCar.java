class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int numberOfVictories = 0;
    private int distance = 0;

    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return this.numberOfVictories - car.numberOfVictories;
    }
}
