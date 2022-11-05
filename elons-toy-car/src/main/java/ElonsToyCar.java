public class ElonsToyCar {
    private int distanceDriven = 0;
    private int batteryRemaining = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryRemaining == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryRemaining + "%";
    }

    public void drive() {
        if (batteryRemaining > 0) {
            distanceDriven += 20;
            batteryRemaining -= 1;
        }
    }
}
