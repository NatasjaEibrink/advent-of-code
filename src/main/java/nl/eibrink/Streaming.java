package nl.eibrink;

import java.util.Arrays;
import java.util.List;

public class Streaming {

    public static void main(String[] args) {

     /*
     1. Turn the strings into uppercase, keep only the ones that are shorter than 4 characters,
     of what is remaining, keep only the ones that contain “E”, and print the first result.
     Repeat the process, except checking for a “Q” instead of an “E”.
     When checking for the “Q”, try to avoid repeating all the code from when you checked for an “E”.
     */

        List<String> words = Arrays.asList("hi", "hello", "moi", "dag", "beh");

        words.stream()
                .map(String::toUpperCase)
                .filter(x -> x.length() < 4)
                .filter(x -> x.contains("E"))
                .forEach(System.out::println);

        /*
        2. Produce a single String that is the result of concatenating the uppercase versions of all of the Strings.
        E.g., the result should be "HIHELLO...".
        Tip: a map operation that turns the words into uppercase, followed by a reduce operation that concatenates them.
         */

        List<String> woorden = Arrays.asList("hi", "hello", "moi", "dag", "beh");

        woorden.stream()
                .map(String::toUpperCase)
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        /*
        3. Find the total number of characters (i.e., sum of the lengths) of the strings in the List.
        */

        List<String> woordjes = Arrays.asList("hi", "hello", "moi", "dag", "beh");

        woordjes.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(x -> System.out.println(x.length()));


    }
}
