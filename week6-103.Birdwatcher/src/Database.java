
import java.util.ArrayList;

public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        birds = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        birds.add(bird);
    }

    public void observation(String observedBird) {
        boolean hasBeenObserved = false;
        for (Bird bird : birds) {
            if (bird.getName().contains(observedBird)) {
                bird.observe();
                hasBeenObserved = true;
            }
        }
        if (!hasBeenObserved) {
            System.out.println("Is not a bird!");
        }
    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void show(String birdName) {
        for (Bird bird : birds) {
            if (bird.getName().contains(birdName)) {
                System.out.println(bird);
            }
        }
    }
}
