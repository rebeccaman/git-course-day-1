import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static int a = 5;
    static int x = 1;

    public static void main(String[] args) {

        int returnedValue = increaseInt(a);
        System.out.println(a);


    }

    private static int increaseInt(int plus) {

        for (int i = 1; i <= x; i++) {
            a = (a + 1);
        }
        int b = a;
        return b;
    }

        /*
        List<String> stringList = List.of("Avatar", "Captain America", "The avengers");

        List<String> sortedList = sortList(stringList);

    }

    private static List<String> sortList(List<String> movieList) {
        //accepting a list as an arguments
        return movieList.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<String> toCapitalLetters (List<String> movies) {
        return  movies.stream()
    }
 /

         */

}


