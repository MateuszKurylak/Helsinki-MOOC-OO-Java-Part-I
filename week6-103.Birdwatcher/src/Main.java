
public class Main {

    public static void main(String[] args) {
        Commands commands = new Commands();
        int a = 0;

        while (a <= 0) {
            System.out.print("? ");
            commands.commandSetter(commands.scan());
            a = commands.exit();
        }
    }
}
