package es.ulpgc;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {

    private final T[] numbers;

    public Histogram(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] numbers() {
        return numbers;
    }

    public Map<T, Integer> getHistogram() {
        HashMap<T, Integer> histogram = new HashMap<>();
        for (T number : numbers) {
            histogram.put(number, histogram.containsKey(number) ? histogram.get(number) + 1 : 1);
        }
        return histogram;
    }
}
