package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> c1 = Arrays.asList(1, 2, 3, 4);
        OddPredicate odd = new OddPredicate();
        int count1 = countIf(c1, odd);
        int count = countIf(c1, new OddPredicate());
        System.out.println("Number of odd integers = " + count1);
        System.out.println("Number of odd integers = " + count);
    }


    private static <T> int countIf(List<T> c, UnaryPredicate<T> p){
        int count = 0;
        for (T each : c){
            if (p.test(each)){
                ++count;
            }
        }
        return count;
    }
}
