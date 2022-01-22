public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 10, 8, 6, 12, 18, 15, 0, 123, 34, 457, 123, 46536}; //n=13 , iMax=12

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }

        showArray(array);
    }

    public static void showArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}
