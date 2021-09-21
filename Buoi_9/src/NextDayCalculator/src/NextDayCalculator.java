package NextDayCalculator.src;

public class NextDayCalculator {
    public static String check(int day, int month, int year) {
        if (day < 31 && dayInMonth(month, year) == 31) {
            day++;
        } else if (day == 31 && dayInMonth(month, year) == 31) {
            if (month == 12) {
                day = 1;
                month = 1;
                year++;
            } else {
                day = 1;
                month++;
            }
        } else if (day < 30 && dayInMonth(month, year) == 30) {
            day++;
        } else if (day == 30 && dayInMonth(month, year) == 30) {
            day = 1;
            month++;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                if (day < 29) {
                    day++;
                } else {
                    day = 1;
                    month = 3;
                }
            } else {
                if (day < 28) {
                    day++;
                } else {
                    day = 1;
                    month = 3;
                }
            }
        }
        return day + " " + month + " " + year;
    }

    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int dayInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                return 31;
            }
            case 2: {
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                return 30;
            }
        }
        return month;
    }
}

