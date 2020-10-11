package StreamF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        System.out.println("Метод без Stream API:");
        for (Integer x : intList) {
            if ((x > 0) && (x%2 == 0)) {
                newList.add(x);
            }
        }
        newList.sort(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer x : newList) {
            System.out.println(x);
        }
        System.out.println();
        StreamMain.main();
    }
}
