package es.ulpgc;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 2, 2,-4, 100, 4, 5, 6, 8, 327, 7, 1, 10, 11, 8, 9, 21, 12, 4, -4};
        Histogram<Integer> histogram = new Histogram(data);
        for (Map.Entry<Integer, Integer> entry : histogram.getHistogram().entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }

    }

}
