import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("guides.txt"));
        int score = 0;
        while (fileScanner.hasNext()) {
            String[] guides = fileScanner.nextLine().split("\\s+");
            //if other elf plays rock
            if (guides[0].equals("A") && guides[1].equals("X")) {
                score += 3;
            }
            if (guides[0].equals("A") && guides[1].equals("Y")) {
                score += 4;
            }
            if (guides[0].equals("A") && guides[1].equals("Z")) {
                score += 8;
            }

            //if the other elf plays paper
            if (guides[0].equals("B") && guides[1].equals("X")) {
                score += 1;
            }
            if (guides[0].equals("B") && guides[1].equals("Y")) {
                score += 5;
            }
            if (guides[0].equals("B") && guides[1].equals("Z")) {
                score += 9;
            }

            //if other elf plays scissors
            if (guides[0].equals("C") && guides[1].equals("X")) {
                score += 2;
            }
            if (guides[0].equals("C") && guides[1].equals("Y")) {
                score += 6;
            }
            if (guides[0].equals("C") && guides[1].equals("Z")) {
                score += 7;
            }
        }
        System.out.println(score);
    }
}