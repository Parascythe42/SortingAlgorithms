public class Sorter {
    /**
     * Uses Selection Sort to sort an array of integers, lowest to highest.
     *
     * @param ints An unsorted array of integers
     * @return A sorted version of the input array
     */
    public int[] selection(int[] ints) {
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

    /**
     * Uses Insertion Sort to sort an array of integers, lowest to highest.
     *
     * @param ints An unsorted array of integers
     * @return A sorted version of the input array
     */
    public int[] insertion(int[] ints) {
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

    /**
     * Uses Bubble Sort to sort an array of integers, lowest to highest.
     *
     * @param ints An unsorted integer array.
     * @return A sorted version of the input array.
     */
    public int[] bubble(int[] ints) {

//        To check if an operation has occurred this pass through.
        boolean operation;
//        For storing one of the items to be swapped.
        int temp;

        // Executes the sorting algorithm until there are no operations this cycle.
        do {
//            Sets to false so it stays false for the last cycle.
            operation = false;
//            Sorts the given array from the second position, comparing backwards.
            for (int i = 1; i < ints.length; i++) {
//            Swaps the current item with the previous item if the current item is less than the previous.
                if (ints[i] < ints[i - 1]) {
//                    Stores the current item.
                    temp = ints[i];
//                            Sets the current item to the previous item.
                    ints[i] = ints[i - 1];
//                            Sets the previous item to the current item.
                    ints[i - 1] = temp;
//                            Verifies an operation has occurred.
                    operation = true;
                }
            }

        } while (operation);

//        Returns the sorted array.
        return ints;

    }
}
