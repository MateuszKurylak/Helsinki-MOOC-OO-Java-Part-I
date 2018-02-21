
public class Accounts {

    public static void main(String[] args) {
        Account one = new Account("Matt's account", 1000);
        Account two = new Account("My account", 0);

        one.withdrawal(100);
        two.deposit(100);

        System.out.println(one);
        System.out.println(two);
    }
}
