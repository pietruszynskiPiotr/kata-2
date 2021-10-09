package es.ulpgc;

import java.util.HashMap;
import java.util.Map;

public class Histogram {

    private final int[] numbers;

    public Histogram(int[] numbers) {
        this.numbers = numbers;
    }

    public Map<Integer, Integer> getHistogram() {
        HashMap<Integer, Integer> histogram = new HashMap<>();
        for (int number : numbers) {
            histogram.put(number, histogram.containsKey(number) ? histogram.get(number) + 1 : 1);
        }
        return histogram;
    }
}
