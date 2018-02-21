
import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {

    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        int i = 0;
        String help = "";
        while (i < this.length) {
            int number = this.random.nextInt(26);
            char s = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            help += s;
            i++;
        }
        return help;
    }
}
