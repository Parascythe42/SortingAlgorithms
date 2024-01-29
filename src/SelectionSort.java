public class SelectionSort {
    /**
     * Uses Selection Sort to sort an array of integers, lowest to highest.
     *
     * @param ints An unsorted array of integers
     * @return A sorted version of the input array
     */
    public int[] sort(int[] ints) {
//        Defining variables.
        int min;
        int minIndex = 0;
        int j;

//        Finds the minimum value and places it for each item in the array.
        for (int i = 0; i < ints.length; i++) {
//            Moves the inner iterator forward so already sorted items are not checked.
            j = i;
//            Reinitializes the minimum.
            min = Integer.MAX_VALUE;
//            Checks every item from the new start to the last item for a minimum.
            while (j < ints.length) {
//                Checks for minimum and store the index.
                if (ints[j] < min) {
                    min = ints[j];
                    minIndex = j;
                }

                j++;
            }
//            Puts the item residing at the current start, the end of the items already sorted, into the location of
//            the new minimum item.
            ints[minIndex] = ints[i];
//            Puts the new minimum item into the end of the sorted items.
            ints[i] = min;
        }

//        Returns the sorted array.
        return ints;
    }
}
