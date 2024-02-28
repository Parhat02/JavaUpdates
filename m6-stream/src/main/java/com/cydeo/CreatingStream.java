package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating Stream from Array
        String[] course = {"Java", "Spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(course);

        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseListStream = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
        );

        Stream<Course> myCoursesStream = myCourses.stream();

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4);

    }
}
