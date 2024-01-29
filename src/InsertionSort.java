public class InsertionSort {
    /**
     * Uses Insertion Sort to sort an array of integers, lowest to highest.
     *
     * @param ints An unsorted array of integers
     * @return A sorted version of the input array
     */
    public int[] sort(int[] ints) {
//        To store the current value to check.
        int key;
//        The iterator to go backwards through the array and check against the key.
        int j;

//        Iterates over the entire array from the second item.
        for (int i = 1; i < ints.length; i++) {
//            Stores the current value to move later.
            key = ints[i];
//            Initializing another iterator.
            j = i - 1;

//            Starts from the previous item and checks if the current item is less than it, continues moving the
//            current item backwards through the array until that's false.
            while (j >= 0 && key < ints[j]) {
//                Sets the next item equal to the previous.
                ints[j + 1] = ints[j];
//                Decrements the second iterator.
                j--;
            }
//            Sets the next item, the one that was just moved ahead, equal to the current value that was stored, so it
//            can be compared to the next previous item.
            ints[j + 1] = key;
        }

//        Returns the sorted array.
        return ints;
    }
}
