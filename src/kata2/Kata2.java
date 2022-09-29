package kata2;

public class Kata2 {
     public static void main(String[] args){
        Integer[] data = {4, 2, 6, 4, 9, 8, 0, 1, 2, 6, 3, 7, 8, 5, 6, 0};
        Histogram histo = new Histogram(data);
        System.out.println(histo.toString());
    }
}