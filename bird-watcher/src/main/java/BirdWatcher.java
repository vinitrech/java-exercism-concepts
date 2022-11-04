
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeek;
    }

    public int getToday() {
        if (birdsPerDay.length > 0) {
            return birdsPerDay[birdsPerDay.length - 1];

        }

        return 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {

        for (int day : birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }

        for (int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int days : birdsPerDay) {
            if (days > 4) {
                busyDays += 1;
            }
        }

        return busyDays;
    }
}
