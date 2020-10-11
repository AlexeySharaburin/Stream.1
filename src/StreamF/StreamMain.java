package StreamF;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("Метод Stream API:");
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0).
                filter(x -> x%2 == 0).
                sorted(Comparator.naturalOrder()).
                forEach(System.out::println);
    }
}
