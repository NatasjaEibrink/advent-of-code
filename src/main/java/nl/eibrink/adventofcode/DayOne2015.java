package nl.eibrink.adventofcode;

        import java.io.BufferedReader;
        import java.io.FileInputStream;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.nio.charset.Charset;
        import java.util.ArrayList;
        import java.util.List;


public class DayOne2015 {

    public static void main(String[] args) throws IOException {

        //part one

        List<Character> characterList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/main/resources/floor-directions"),
                        Charset.forName("UTF-8")));
        int c;
        while ((c = reader.read()) != -1) {
            char character = (char) c;
            characterList.add(character);
        }

        //System.out.println(characterList);

        int currentFloor = 0;

        for (char i = 0; i < characterList.size(); i++) {
            if (characterList.get(i).equals('(')) {
                currentFloor++;
            } else if (characterList.get(i).equals(')')) {
                currentFloor--;
            }
        }
        System.out.println(currentFloor);

        //part two

        boolean basementNotReached = true;
        int destinationFloor = -1;

        int positionCounter = 0;

        while(basementNotReached) {

            for (char i = 0; i < characterList.size(); i++) {
                if (characterList.get(i).equals('(')) {
                    currentFloor++;
                } else if (characterList.get(i).equals(')')) {
                    currentFloor--;
                }

                ++positionCounter;

                if (currentFloor == destinationFloor) {
                    basementNotReached = false;
                    System.out.println(positionCounter);
                    break;
                }

            }
        }

    }
}
