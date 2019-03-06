package nl.eibrink;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DayOne {

    //Part one

    public static void main( String[] args ) throws IOException {
        List<String> stringList;

        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/puzzle-input"))) {
            stringList = stream.collect(Collectors.toList());
        }

        //Convert String values to int values
        List<Integer> intList = stringList.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());


        int sum = intList.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);


        //Part two


    }
}
