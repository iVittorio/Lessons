package ru.sbt.ivanov.lesson03;

import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        SortedMap<String, Integer> map = new TreeMap<>();

        int max = 0;

        for (String word : words) {
            String tmpStr = word.toLowerCase();
            if (!map.containsKey(tmpStr)) {
                map.put(tmpStr, 1);
            }
            int count = map.get(tmpStr);
            map.put(tmpStr, ++count);
            if (count > max) max = count;
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == max) {
                System.out.println(pair.getKey());
            }
        }
    }
}
