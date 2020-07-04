import java.util.*;
public class Average {
    public static Double calculateAverage(List<Integer> intList) {

        Double average = intList.stream().mapToInt(val -> val).average().orElse(0.0);
        return average;
    }
}
