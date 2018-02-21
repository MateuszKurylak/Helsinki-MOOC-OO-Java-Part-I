
import java.util.Scanner;

public class Commands {

    Scanner reader = new Scanner(System.in);
    private String scanned;
    private String name;
    private String latinName;
    private int quit;
    Database database = new Database();

    public Commands() {

    }

    public void commandSetter(String command) {
        if (command.equals("Add")) {
            System.out.print("Name: ");
            scan();
            this.name = scanned;
            System.out.print("Latin Name: ");
            scan();
            this.latinName = scanned;
            Bird bird = new Bird(name, latinName);
            database.add(bird);
        }
        if (command.equals("Observation")) {
            System.out.print("What was observed:? ");
            scan();
            database.observation(scanned);
        }
        if (command.equals("Statistics")) {
            database.statistics();
        }
        if (command.equals("Show")) {
            System.out.print("What? ");
            scan();
            database.show(scanned);
        }
        if (command.equals("Quit")) {
            quit();
        }
    }

    public String scan() {
        return this.scanned = reader.nextLine();
    }

    public void quit() {
        this.quit++;
    }

    int exit() {
        return this.quit;
    }
}
