import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DayThreeP2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("rucksacks.txt"));
        Map<String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", 1);
        alphabet.put("b", 2);
        alphabet.put("c", 3);
        alphabet.put("d", 4);
        alphabet.put("e", 5);
        alphabet.put("f", 6);
        alphabet.put("g", 7);
        alphabet.put("h", 8);
        alphabet.put("i", 9);
        alphabet.put("j", 10);
        alphabet.put("k", 11);
        alphabet.put("l", 12);
        alphabet.put("m", 13);
        alphabet.put("n", 14);
        alphabet.put("o", 15);
        alphabet.put("p", 16);
        alphabet.put("q", 17);
        alphabet.put("r", 18);
        alphabet.put("s", 19);
        alphabet.put("t", 20);
        alphabet.put("u", 21);
        alphabet.put("v", 22);
        alphabet.put("w", 23);
        alphabet.put("x", 24);
        alphabet.put("y", 25);
        alphabet.put("z", 26);
        alphabet.put("A", 27);
        alphabet.put("B", 28);
        alphabet.put("C", 29);
        alphabet.put("D", 30);
        alphabet.put("E", 31);
        alphabet.put("F", 32);
        alphabet.put("G", 33);
        alphabet.put("H", 34);
        alphabet.put("I", 35);
        alphabet.put("J", 36);
        alphabet.put("K", 37);
        alphabet.put("L", 38);
        alphabet.put("M", 39);
        alphabet.put("N", 40);
        alphabet.put("O", 41);
        alphabet.put("P", 42);
        alphabet.put("Q", 43);
        alphabet.put("R", 44);
        alphabet.put("S", 45);
        alphabet.put("T", 46);
        alphabet.put("U", 47);
        alphabet.put("V", 48);
        alphabet.put("W", 49);
        alphabet.put("X", 50);
        alphabet.put("Y", 52);
        alphabet.put("Z", 52);
        
        int sumPriorities = 0;
        List<String> linesList = new ArrayList<>();

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            linesList.add(line);
            if (linesList.size() == 3) {
                List<String> commonChars = sharedChars(linesList);
                for (int i = 0; i < commonChars.size(); i++) {
                    sumPriorities += alphabet.get(commonChars.get(i));
                }
                linesList = new ArrayList<>();
            }
        }

        System.out.println(sumPriorities);
        
    }

    public static List<String> sharedChars(List<String> linesList) {
        LinkedHashSet<String> uniqueStrings = new LinkedHashSet<String>();
        char[] first = linesList.get(0).toCharArray();
        char[] second = linesList.get(1).toCharArray();
        char[] third = linesList.get(2).toCharArray();

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                for (int x = 0; x < third.length; x++) {
                    if (first[i] == second[j] && second[j] == third[x]) {
                        uniqueStrings.add(Character.toString(first[i]));
                    }
                }
            }
        }
        List<String> commonChars = new ArrayList<String>(uniqueStrings);
        return commonChars;
    }
}
