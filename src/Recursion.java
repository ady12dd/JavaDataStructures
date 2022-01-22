public class Recursion {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(30));
        System.out.println(recursiveFactorial(30));
    }

    //1!=0!*1=1
    //2!=1!*2=2
    //3!=2!*3=6
    //........
    //n!=(n-1)!*n

    public static double iterativeFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double recursiveFactorial(int number) {
        if(number==0){
            return 1;
        }

        return number*recursiveFactorial(number-1);
    }
}
