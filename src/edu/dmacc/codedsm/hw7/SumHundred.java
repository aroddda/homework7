package edu.dmacc.codedsm.hw7;

public class SumHundred {
    public static void main(String[] args) {
        int result = adder(1, 2, 0);//result=3
        int iterations = 0;

        while (result < 100) {
            result = adder(1, 2, result);
            iterations = iterations + 1;
        }
        output(result,iterations);
    }

    public static int adder(int firstInput, int secondInput, int priorResult) {
        return firstInput + secondInput + priorResult;
    }

    public static void output(int finalResult, int iterations) {
        System.out.println("The first result greater than 100 was " + finalResult + " and took " + iterations + " to complete");
    }
}
