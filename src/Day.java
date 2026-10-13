public enum Day {
    MONDAY(1), TUESDAY(2), WEDNESSDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7), QCDAY(8);

    private final int dayNumber;

    Day(int day) {
        this.dayNumber = day;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}
