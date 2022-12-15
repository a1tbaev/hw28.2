import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        double avr = list.stream().mapToInt(Integer::valueOf).average().getAsDouble();
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum of numbers ->" + sum);
        System.out.println("average -> " + avr);
        System.out.println("count numbers -> " + list.stream().count());
    }
}