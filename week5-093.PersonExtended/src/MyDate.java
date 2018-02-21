
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        double first;
        double second;
        double a;
        int b = 0;

        first = day + (month * 30 - 30) + (year * 360);
        second = compared.day + (compared.month * 30 - 30) + (compared.year * 360);

        if (first > second) {
            a = (first - second) / 360;
        } else {
            a = (second - first) / 360;
        }
        b = (int) a;
        return b;
    }
}
