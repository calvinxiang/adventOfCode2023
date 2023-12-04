package org.aoc;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;


public class Day1
{
    public static void main( String[] args ) throws FileNotFoundException {
        FileReader input = new FileReader("src/main/resources/day1Input.txt");
        Scanner myReader = new Scanner(input);
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);

        int total = 0;

        while(myReader.hasNextLine()) {
            HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
            String data = myReader.nextLine();
            if (data.indexOf("one") != -1) {
                index.put(data.indexOf("one"), numbers.get("one"));
                index.put(data.lastIndexOf("one"), numbers.get("one"));
            }
            if (data.indexOf("two") != -1) {
                index.put(data.indexOf("two"), numbers.get("two"));
                index.put(data.lastIndexOf("two"), numbers.get("two"));
            }
            if (data.indexOf("three") != -1) {
                index.put(data.indexOf("three"), numbers.get("three"));
                index.put(data.lastIndexOf("three"), numbers.get("three"));

            }
            if (data.indexOf("four") != -1) {
                index.put(data.indexOf("four"), numbers.get("four"));
                index.put(data.lastIndexOf("four"), numbers.get("four"));

            }
            if (data.indexOf("five") != -1) {
                index.put(data.indexOf("five"), numbers.get("five"));
                index.put(data.lastIndexOf("five"), numbers.get("five"));

            }
            if (data.indexOf("six") != -1) {
                index.put(data.indexOf("six"), numbers.get("six"));
                index.put(data.lastIndexOf("six"), numbers.get("six"));

            }
            if (data.indexOf("seven") != -1) {
                index.put(data.indexOf("seven"), numbers.get("seven"));
                index.put(data.lastIndexOf("seven"), numbers.get("seven"));

            }
            if (data.indexOf("eight") != -1) {
                index.put(data.indexOf("eight"), numbers.get("eight"));
                index.put(data.lastIndexOf("eight"), numbers.get("eight"));

            }
            if (data.indexOf("nine") != -1) {
                index.put(data.indexOf("nine"), numbers.get("nine"));
                index.put(data.lastIndexOf("nine"), numbers.get("nine"));

            }
            for(int i = 0; i < data.length(); i++) {
                if(Character.isDigit(data.charAt(i))) {
                     index.put(i, data.charAt(i) - '0');
                }
            }
            int answer = 0;
            int first = Collections.min(index.keySet());
            int last = Collections.max(index.keySet());
            int firstAns = index.get(first);
            int lastAns = index.get(last);
            answer = firstAns * 10 + lastAns;
            System.out.println(firstAns + ", " + lastAns);
            total += answer;
        }
        System.out.println(total);
        myReader.close();
    }
}
