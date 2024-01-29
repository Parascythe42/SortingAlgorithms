import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int range = 10000;
        int length = 100;
        int[] unsorted = new int[length];
        int[] sorted;
        Random random = new Random();

        Sorter sorter = new Sorter();

        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = random.nextInt(range);
        }

//        sorted = sort.bubble(unsorted);
//        sorted = sort.insertion(unsorted);
        sorted = sorter.selection(unsorted);

        System.out.println(Arrays.toString(sorted));
        System.out.println(sorter.verify(sorted));
    }
}