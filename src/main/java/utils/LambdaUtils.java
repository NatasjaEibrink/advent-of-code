package utils;

import java.util.Comparator;

public class LambdaUtils {

    public static Comparator<String> comparingBasedOnCharacter() {

        return Comparator.<String, Boolean>comparing(s -> s.contains("e")).reversed();
    }
}
