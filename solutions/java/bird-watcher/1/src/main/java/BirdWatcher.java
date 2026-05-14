
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int birdsPerDayLength;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.birdsPerDayLength = birdsPerDay.length;
    }

    public int[] getLastWeek() {
        int freq[] = {0, 2, 5, 3, 7, 8, 4};
        return freq;
    }

    public int getToday() {
        return birdsPerDay[this.birdsPerDayLength - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDayLength - 1] = this.birdsPerDay[this.birdsPerDayLength - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day: this.birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < this.birdsPerDayLength; i++) {
            if (i == numberOfDays) {
                return sum;
            }
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for (int day: this.birdsPerDay) {
            if (day >= 5) {
                count++;
            }
        }
        return count;
    }
}
