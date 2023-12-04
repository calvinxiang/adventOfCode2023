package org.aoc;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader input = new FileReader("src/main/resources/day2Input.txt");
        Scanner myReader = new Scanner(input);

        int totalRed = 12, totalGreen = 13, totalBlue = 14;
        int answer = 0;

        while (myReader.hasNextLine()) {
            HashMap<Integer, Integer> reds = new HashMap<Integer, Integer>();
            HashMap<Integer, Integer> greens = new HashMap<Integer, Integer>();
            HashMap<Integer, Integer> blues = new HashMap<Integer, Integer>();

            String data = myReader.nextLine();
            String[] parts = data.split(": ");


            String[] sets = parts[1].split("; ");
            boolean isPossible = true;

            for (String set : sets) {
                String[] cubes = set.split(", ");

                for (String cube : cubes) {
                    String[] details = cube.split(" ");
                    int count = Integer.parseInt(details[0]);
                    switch (details[1]) {
                        case "red":
                            reds.put(count, count);
                            break;
                        case "green":
                            greens.put(count, count);
                            break;
                        case "blue":
                            blues.put(count, count);
                            break;
                    }
                }

            }
            answer += Collections.max(reds.keySet()) * Collections.max(greens.keySet()) * Collections.max(blues.keySet());
        }

        System.out.println("Total sum of possible game IDs: " + answer);
        myReader.close();
    }
}
