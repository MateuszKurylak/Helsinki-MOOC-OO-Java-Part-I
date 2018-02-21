
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account newBartAccount = new Account("New account amount", 100.00);
        newBartAccount.deposit(20);
        System.out.println(newBartAccount);
    }
}
