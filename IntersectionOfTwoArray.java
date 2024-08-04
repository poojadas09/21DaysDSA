import java.util.*;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 2};
        int[] secondArray = {1, 3, 4, 6, 2, 3, 2};
        Arrays.stream(firstArray).filter(
                        x -> Arrays.stream(secondArray).anyMatch(
                                y -> y == x)).distinct()
                .forEach(System.out::println);
    }
}
