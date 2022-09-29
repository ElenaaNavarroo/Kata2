package kata2;

public class Kata2 {
     public static void main(String[] args){
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa", "Lucía", "Pepe", "Lucía"};
        Histogram histo = new Histogram(data);
        System.out.println(histo.toString());
    }
}