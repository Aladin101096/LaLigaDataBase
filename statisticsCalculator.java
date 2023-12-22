import java.util.Arrays;
import java.util.Comparator;

public class statisticsCalculator {

    public Teams[] table = {new fcBarcelona(), new realMadrid(), new atleticoMadrid()};

    statisticsCalculator(){

        //Sort the table by points
        Arrays.sort(table, Comparator.comparingInt(Teams::getTotalPoints).reversed());

    }



}
