package nl.eibrink;

import utils.LambdaUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparing implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {

        // 1.1 (short to long length)
        List<String> stringList = Arrays.asList("Shiba", "Bas", "Jelmer", "enum", "beste");

        //OR: Collections.sort(stringList, new Comparing());
        stringList.sort(Comparator.comparingInt(String::length));
        System.out.println(stringList);

        // 1.2 (long to short length)

        //OR: Collections.sort(stringList, new Comparing().reversed());
        stringList.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(stringList);

        // 1.3 (alphabetically based on first letter)

        stringList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(stringList);

        //1.4 (strings that contain "e" first


        /*
        Collections.sort(stringList, (s1,s2) ->

        int compareFlag = 0;
        if(s1.contains("e") &
        )
         */

        Comparator<String> comparator = Comparator.<String, Boolean>comparing(s -> s.contains("e")).reversed();
        Collections.sort(stringList, comparator);
        System.out.println(stringList);

        //1.5 (redo previous problem, but use static helper method

        Collections.sort(stringList, LambdaUtils.comparingBasedOnCharacter());
        System.out.println(stringList);
    }


}
