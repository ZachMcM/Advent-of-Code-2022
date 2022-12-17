import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DayOne {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("calories.txt"));
        ArrayList<Integer> caloriesList = new ArrayList<>();
        int total = 0;
        int current = 0;
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            if (line.length() == 0) {
                total = Math.max(total, current);
                caloriesList.add(current);
                current = 0;
            } else {
                current+= Integer.parseInt(line);
            }
        }
        caloriesList.add(current);
        Collections.sort(caloriesList);
        int topThree = caloriesList.get(caloriesList.size() - 1) + caloriesList.get(caloriesList.size() - 2) + caloriesList.get(caloriesList.size() - 3);
        System.out.println("Max: " + caloriesList.get(caloriesList.size() - 1));
        System.out.println("Top Three: " + topThree);

    }
}
