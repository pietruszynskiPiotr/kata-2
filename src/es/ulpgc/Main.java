package es.ulpgc;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 2,-4, 100, 4, 5, 6, 8, 327, 7, 1, 10, 11, 8, 9, 21, 12, 4, -4};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int number : data) {
            histogram.put(number, histogram.containsKey(number) ? histogram.get(number) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }

    }

}
