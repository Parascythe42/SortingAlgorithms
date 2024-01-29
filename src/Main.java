import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int range = 10000;
        int length = 100;
        int[] unsorted = new int[length];
        int[] sorted;
        Random random = new Random();

//        BubbleSort sort = new BubbleSort();
//        InsertionSort sort = new InsertionSort();
        SelectionSort sort = new SelectionSort();

        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = random.nextInt(range);
        }

        sorted = sort.sort(unsorted);

        System.out.println(Arrays.toString(sorted));
    }
}