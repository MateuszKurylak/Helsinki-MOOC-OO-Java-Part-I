
public class Reformatory {

    private int helper = 0;

    public int weight(Person person) {
        this.helper++;

        return person.getWeight();
    }

    public void feed(Person person) {
        int feeded = person.getWeight();
        feeded++;
        person.setWeight(feeded);
    }

    public int totalWeightsMeasured() {
        return this.helper;
    }
}
