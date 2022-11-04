public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        /*
         * 1 to 4: 100% success rate.
         * 5 to 8: 90% success rate.
         * 9: 80% success rate.
         * 10: 77% success rate
         */

        int baseCalculation = speed * 221;

        if (speed < 5) {
            return baseCalculation;
        } else if (speed < 9) {
            return baseCalculation * 0.9;
        } else if (speed < 10) {
            return baseCalculation * 0.8;
        }

        return baseCalculation * 0.77;

    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
