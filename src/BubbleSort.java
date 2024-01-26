public class BubbleSort {
    public int[] sort(int[] unsorted) {

        boolean operation;
        int temp;

        do {
            operation = false;
            for (int i = 1; i < unsorted.length; i++) {
                        if (unsorted[i] < unsorted[i - 1]) {
                            temp = unsorted[i];
                            unsorted[i] = unsorted[i - 1];
                            unsorted[i - 1] = temp;
                            operation = true;
                            }
                }

        } while (operation);

        return unsorted;

    }
}
