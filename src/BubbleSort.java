public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 10, 8, 6, 12, 18, 15, 0, 123, 34, 457, 123, 46536}; //n=13 , iMax=12
        int length = array.length;
        //int aux;
//        for (int j = 0; j < array.length - 1; j++) {
//            for (int i = 0; i < array.length; i++) {
//
//                if ((i + 1) < length) {
//                    if (array[i] > array[i + 1]) {
//                        aux = array[i];
//                        array[i] = array[i + 1];
//                        array[i + 1] = aux;
//                    }
//                }
//            }
//        }

//        int aux2=array.length;
//        while(aux2>=0){
//            for (int i = 0; i < array.length; i++) {
//
//                if ((i + 1) < length) {
//                    if (array[i] > array[i + 1]) {
//                        aux = array[i];
//                        array[i] = array[i + 1];
//                        array[i + 1] = aux;
//                    }
//                }
//            }
//            aux2--;
//        }

        for(int lastUnsortedItem=array.length-1;lastUnsortedItem>0;lastUnsortedItem--){
            for (int i=0;i<lastUnsortedItem;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
