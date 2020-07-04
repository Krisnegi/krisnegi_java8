import java.util.*;
import java.util.stream.Collectors;

public class ExactlyThreeLetters {
    public static List<String> search(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }
}
