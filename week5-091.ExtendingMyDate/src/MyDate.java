
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
        return day + "." + month + "." + year;
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

    public void advance() {
        day++;
        if (day >= 31) {
            day -= 30;
            month++;
            if (month >= 13) {
                month -= 12;
                year++;
            }
        }
    }

    public void advance(int numbersOfDays) {
        for (int i = 0; i < numbersOfDays; i++) {
            advance();
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(day, month, year);
        newMyDate.advance(days);

        return newMyDate;
    }
}
