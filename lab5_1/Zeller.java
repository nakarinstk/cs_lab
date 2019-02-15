
public class Zeller {
    private int dayOfMonth;
    private int month;
    private int year;

    public enum Day {
        SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"),
        FRIDAY("Friday"), SATURDAY("Saturday"), NULL("");
        String val = "";

        private Day(String val) {
            this.val = val;
        }

        public String toString() {
            return this.val;
        }
    }

    public Zeller(int usrYear, int usrMonth, int usrDateOfMonth) {
        dayOfMonth = usrDateOfMonth;
        if (usrMonth == 1 || usrMonth == 2) {
            month = usrMonth + 12;
            year = usrYear - 1;
        } else {
            month = usrMonth;
            year = usrYear;
        }

    }

    public Day getDayOfWeek() {
        int h = ((dayOfMonth + (26 * (month + 1) / 10) + (year % 100) + ((year % 100) / 4) + (year / 400)
                + (5 * year / 100)) % 7);
        switch (h) {
        case 0:
            return Day.SATURDAY;
        case 1:
            return Day.SUNDAY;
        case 2:
            return Day.MONDAY;
        case 3:
            return Day.TUESDAY;
        case 4:
            return Day.WEDNESDAY;
        case 5:
            return Day.THURSDAY;
        case 6:
            return Day.FRIDAY;
        default:
            return Day.NULL;
        }

    }
}
