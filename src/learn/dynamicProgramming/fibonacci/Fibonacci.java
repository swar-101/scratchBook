package learn.dynamicProgramming.fibonacci;

public class Fibonacci {

/*    int fibonacciOf(int A) {
        if (A <= 1) {
            return A;
        }

        int[] fibonacciNumbers = new int[A+1];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i <= A; i ++) {
            fibonacciNumbers[i]  = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        System.out.println("FibonacciNumbers list: " + fibonacciNumbers);

        return fibonacciNumbers[A];
    }*/


    public int fibonacciOf(int A) {
        if (A <= 1) {
            return A;
        }

        int secondLastFibonacci = 0;
        int lastFibonacci = 1;

        for (int i = 2; i <= A; i ++) {

            int currentFibonacci = lastFibonacci + secondLastFibonacci;
            secondLastFibonacci = lastFibonacci;
            lastFibonacci = currentFibonacci;
        }
        System.out.println("FibonacciNumbers list: " + lastFibonacci);

        return lastFibonacci;
    }
}
