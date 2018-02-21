
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("--------- Top 10 by goals --------");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\n" + "--------- Top 25 by the penalty amounts --------");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\n" + "--------- Statistics for Sidney Crosby --------");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\n" + "--------- Statistics for Philadelphia Flyers (PHI) --------");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("\n" + "--------- ANA players in order by points --------");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
