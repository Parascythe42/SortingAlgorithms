public class BubbleSort {
    /**
     * Uses Bubble Sort to sort an array of integers, lowest to highest.
     *
     * @param ints An unsorted integer array.
     * @return A sorted version of the input array.
     */
    public int[] sort(int[] ints) {

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
