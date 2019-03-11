package nl.eibrink.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DayOne {

    public static void main(String[] args) throws IOException {

        //Part one

        List<String> stringList;

        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/puzzle-input"))) {
            stringList = stream.collect(Collectors.toList());
        }

        //Convert String values to int values
        List<Integer> intList = stringList.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        intList.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        // Part two


        List<Integer> resultList = new ArrayList<>();
        int currentFrequency = 0;

        for(int i = 0; i < intList.size()-1; i++) {
            int nextFrequency = intList.get(i);
            int resultingFrequency = currentFrequency + nextFrequency;
            resultList.add(resultingFrequency);
            currentFrequency = resultingFrequency;
        }
        System.out.println(resultList);

        Map<Integer, Long> result = resultList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
