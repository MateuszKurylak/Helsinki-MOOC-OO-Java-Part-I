
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
            return true;
        }
        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        double first;
        double second;
        double a;
        int b = 0;

        first = day + (month * 30 - 30) + (year * 360);
        second = comparedDate.day + (comparedDate.month * 30 - 30) + (comparedDate.year * 360);

        if (first > second) {
            a = (first - second) / 360;
        } else {
            a = (second - first) / 360;
        }
        b = (int) a;
        return b;
    }
}
