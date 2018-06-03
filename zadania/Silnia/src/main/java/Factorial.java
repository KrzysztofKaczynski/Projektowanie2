public class Factorial {

    public static int recursiveFactorial(int number) {
        if(number <= 1 ){
            return 1;
        } else {
            return  number * recursiveFactorial(number-1);
        }
    }

    public static int iterativeFactorial(int number) {
        int result = 1;
        for(int i = number; i > 0 ; i--) {
            result *= i;
        }
        return result;
    }
}
