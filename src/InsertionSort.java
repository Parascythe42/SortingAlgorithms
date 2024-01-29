public class InsertionSort {
    /**
     * Uses Insertion Sort to sort an array of integers, lowest to highest.
     *
     * @param unsorted An unsorted array of integers
     * @return A sorted version of the input array
     */
    public int[] sort(int[] unsorted) {
//        Defining variables.
        int key;
        int j;

//        Iterates over the entire array from the second item.
        for (int i = 1; i < unsorted.length; i++) {
//            Stores the current value to move later.
            key = unsorted[i];
//            Initializing another iterator.
            j = i - 1;

//            Starts from the previous item and checks if the current item is less than it, continues moving the
//            current item backwards through the array until that's false.
            while (j >= 0 && key < unsorted[j]) {
//                Sets the next item equal to the previous.
                unsorted[j + 1] = unsorted[j];
//                Decrements the second iterator.
                j--;
            }
//            Sets the next item, the one that was just moved ahead, equal to the current value that was stored, so it
//            can be compared to the next previous item.
            unsorted[j + 1] = key;
        }

//        Returns the sorted array.
        return unsorted;
    }
}
