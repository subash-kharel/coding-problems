
/*
learning from : https://stackabuse.com/guide-to-java-8-collectors-groupingby/
 */


package main.java.collectors;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class runner {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20)
        );

        Map<String, List<Student>> studentsBySubject = students
                .stream()
                .collect(
                        Collectors.groupingBy(Student::getSubject)
                );
        System.out.println(studentsBySubject);


        Map<String, List<String>> studentsByCity = students
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getCity,
                                Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(studentsByCity);


        Map<Integer, Long> countByAgeGreaterThan20 = students.stream()
                .filter(std -> std.getAge() > 20)
                .collect(Collectors.groupingBy(
                        Student::getAge,
                        Collectors.counting()));
        System.out.println(countByAgeGreaterThan20);


        //here TreeMap is the map implementation we want to contain our end result to.
        Map<String, List<String>> namesByCityTreeMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCity,
                        TreeMap::new,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(namesByCityTreeMap);


        //WIth out use of TreeMap above one example we woul've had to do is this
        Map<String, List<String>> namesByCity = students.stream().collect(Collectors.groupingBy(
                Student::getCity,
                Collectors.mapping(Student::getName, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(comparing(e -> e.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));

    }
}
