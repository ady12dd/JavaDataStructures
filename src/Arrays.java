import java.util.Scanner;

public class Arrays {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = new int[7];//static data structure, we can't change the size
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        for (int a : intArray
        ) {
            System.out.println(a);
        }
        System.out.println("Give me a number ");
        int index=-1;
        int number=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]==number){
                System.out.println("The number that you are looking for is "+intArray[i]);
                index=i;
                break;
            }
        }
        System.out.println("The index where you number is "+index);
        scanner.close();
    }
}
