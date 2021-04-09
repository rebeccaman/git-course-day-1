import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = List.of("Avatar", "Captain America", "The avengers");

        List<String> sortedList = sortList(stringList);

    }

    private static List<String> sortList(List<String> movieList) {
        //accepting a list as an arguments
        return movieList.stream()
                .sorted()
                .collect(Collectors.toList());
    }

}

