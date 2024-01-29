import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Variable definitions.
        int range = 10000;
        int length = 100;
        int[] unsorted = new int[length];
        int[] sorted;
        Random random = new Random();
        Sorter sorter = new Sorter();

//        Fills the array with random values.
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = random.nextInt(range);
        }

//        Sorts the array and stores it in another variable.
//        sorted = sort.bubble(unsorted);
//        sorted = sort.insertion(unsorted);
        sorted = sorter.selection(unsorted);

//        Prints the array to the console.
        System.out.println(Arrays.toString(sorted));
//        Prints if the array is sorted or not.
        System.out.println(sorter.verify(sorted) ? "The array is sorted.\uD83D\uDC4D" : "The array is not sorted.\uD83D\uDC4E");
    }
}