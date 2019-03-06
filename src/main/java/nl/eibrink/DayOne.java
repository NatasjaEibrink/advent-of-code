package nl.eibrink;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DayOne {

    public static void main( String[] args ) throws IOException {

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
                .reduce((x,y) -> x+y)
                .ifPresent(System.out::println);

        // part two




    }
}
