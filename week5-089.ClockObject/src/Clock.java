
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        seconds = new BoundedCounter(59);
        minutes = new BoundedCounter(59);
        hours = new BoundedCounter(23);

        seconds.setValue(secondsAtBeginning);
        minutes.setValue(minutesAtBeginning);
        hours.setValue(hoursAtBeginning);

    }

    public void tick() {
        try {
            // Clock advances by one second
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
        }
        seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();

            }
        }

    }

    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
