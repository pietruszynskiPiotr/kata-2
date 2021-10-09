package es.ulpgc;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{"John", "Piotr", "Pedro", "Michael", "Lucy", "Sofia", "John", "Stephen", "Michael", "Harry", "Anne", "Michael"};
        Histogram<String> histogram = new Histogram(names);
        for (Map.Entry<String, Integer> entry : histogram.getHistogram().entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }

}
