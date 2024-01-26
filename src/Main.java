import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int range = 10000;
        int length = 100;
        int[] unsorted = new int[length];
        int[] sorted = new int[length];
        Random random = new Random();

        BubbleSort bubbleSort = new BubbleSort();

        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = random.nextInt(range);
        }

        sorted = bubbleSort.sort(unsorted);
    }
}