public class SelectionSort {
    public int[] sort(int[] unsorted) {

        int min;
        int minIndex = 0;
//        int max = Integer.MIN_VALUE;

        int j;

        for (int i = 0; i < unsorted.length; i++) {
            j = i;
            min = Integer.MAX_VALUE;
            while (j < unsorted.length) {
                if (unsorted[j] < min) {
                    min = unsorted[j];
                    minIndex = j;
                }

                j++;
            }
            unsorted[minIndex] = unsorted[i];
            unsorted[i] = min;
        }

        return unsorted;
    }
}
