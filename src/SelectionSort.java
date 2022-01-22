public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 10, 8, 6, 12, 18, 15, 0, 123, 34, 457, 123, 46536};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[largest] < array[i]) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);//punem la cap pe primul care este cel mai mare
        }

        showArray(array);

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void showArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}
