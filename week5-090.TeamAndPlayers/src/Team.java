
import java.util.ArrayList;

public class Team {

    private ArrayList<Player> list = new ArrayList<Player>();
    private String name;
    private int maxTeamSize = 16;

    public Team(String teamName) { // adds team
        this.name = teamName;
    }

    public String getName() { //return team name
        return this.name;
    }

    public void addPlayer(Player playerName) {
        list.add(playerName);

    }

    public void printPlayers() {
        for (Player element : list) {
            System.out.println(element);
        }
    }

    public void setMaxSize(int maxSize) {
        maxTeamSize = maxSize;
    }

    public int size() {
        if (list.size() < maxTeamSize) {
            return list.size();
        } else {
            return maxTeamSize;
        }
    }

    public int goals() {
        int b = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i).goals();
            b += a;
        }
        return b;
    }
}
