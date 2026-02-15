import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class MyTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
