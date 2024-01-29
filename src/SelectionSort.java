public class SelectionSort {
    public int[] sort(int[] ints) {

        int min;
        int minIndex = 0;

        int j;

        for (int i = 0; i < ints.length; i++) {
            j = i;
            min = Integer.MAX_VALUE;
            while (j < ints.length) {
                if (ints[j] < min) {
                    min = ints[j];
                    minIndex = j;
                }

                j++;
            }
            ints[minIndex] = ints[i];
            ints[i] = min;
        }

        return ints;
    }
}
