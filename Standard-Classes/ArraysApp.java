import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] number = {
                1, 4, 5, 2, 7, 7, 3, 8, 33, 24, 4, 1, 5
        };

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.binarySearch(number, 24));
        int [] copyResult = Arrays.copyOfRange(number, 5,6);
        System.out.println(Arrays.toString(copyResult));
    }
}
