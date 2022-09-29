package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {4, 2, 6, 4, 9, 8, 0, 1, 2, 6, 3, 7, 8, 5, 6, 0};

        Histogram histo = new Histogram(data);

        Map<Integer,Integer> histogram = histo.getHistogram();
        
        for(Map.Entry<Integer, Integer> entry: histogram.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        
    }
    
}
