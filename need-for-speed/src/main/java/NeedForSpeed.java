class NeedForSpeed {
    private int speed = 0;
    private int batteryDrain = 0;
    private int distance = 0;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryDrain > this.battery;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance = 0;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.distanceDriven() < this.distance) {
            if (car.batteryDrained()) {
                return false;
            }
            car.drive();
        }

        return true;
    }
}
