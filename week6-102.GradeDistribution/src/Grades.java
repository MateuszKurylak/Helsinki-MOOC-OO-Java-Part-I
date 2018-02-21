
public class Grades {

    private int grade0 = 0;
    private int grade1 = 0;
    private int grade2 = 0;
    private int grade3 = 0;
    private int grade4 = 0;
    private int grade5 = 0;

    public Grades() {
    }

    public void add(int points) {

        while (points >= 0 && points <= 29) {
            grade0++;
            break;
        }
        while (points >= 30 && points <= 34) {
            grade1++;
            break;
        }
        while (points >= 35 && points <= 39) {
            grade2++;
            break;
        }
        while (points >= 40 && points <= 44) {
            grade3++;
            break;
        }
        while (points >= 45 && points <= 49) {
            grade4++;
            break;
        }
        while (points >= 50 && points <= 60) {
            grade5++;
            break;
        }
        while (points < 0 && points > 60) {
            break;
        }
    }

    public double acceptance() {
        int positiveSum = grade1 + grade2 + grade3 + grade4 + grade5;
        int allSum = grade0 + positiveSum;
        if (positiveSum != 0 && allSum != 0) {
            return positiveSum * 100 / allSum;
        }
        return 0;
    }

    public String starsCreator(int number) {
        String star = "";
        for (int i = 0; i < number; i++) {
            star += "*";
        }
        return star;
    }

    public void printGrades() {
        System.out.println("5: " + starsCreator(grade5));
        System.out.println("4: " + starsCreator(grade4));
        System.out.println("3: " + starsCreator(grade3));
        System.out.println("2: " + starsCreator(grade2));
        System.out.println("1: " + starsCreator(grade1));
        System.out.println("0: " + starsCreator(grade0));
    }
}
