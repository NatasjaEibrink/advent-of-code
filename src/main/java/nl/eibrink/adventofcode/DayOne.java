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



        List<Integer> resultingFrequencies = new ArrayList<>();

        boolean frequencyNotSeenBefore = true;
        int currentFrequency = 0;

        while(frequencyNotSeenBefore) {

            for (int i = 0; i < intList.size(); i++) {
                int nextFrequency = intList.get(i);
                int resultingFrequency = currentFrequency + nextFrequency;
                currentFrequency = resultingFrequency;
                if(resultingFrequencies.contains(resultingFrequency)){
                    frequencyNotSeenBefore = false;
                    System.out.println(resultingFrequency);
                    break;
                } else {
                    resultingFrequencies.add(resultingFrequency);
                    continue;
                }
            }
        }
    }
}
