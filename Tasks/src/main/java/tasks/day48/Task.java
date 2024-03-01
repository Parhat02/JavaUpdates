package tasks.day48;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {

        System.out.println("Task 1");
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list2= list.stream()
                .map(integer -> integer*integer)
                .collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("Task 2");
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(4,5);

        numbers1.stream()
                .flatMap(i -> numbers2.stream().
                        map(j -> new int[] {i, j}))
                .forEach(p -> System.out.println(Arrays.toString(p)));


    }

}
