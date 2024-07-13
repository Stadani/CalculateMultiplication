package tests;

import algorithms.BigIntAlgorithm;
import algorithms.MultiplicationInterface;
import algorithms.ScratchAlgorithm;
import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @Test
    public void testPerformance() {
        String num1 = "12345678901234567890";
        String num2 = "11111111111111111111";

        MultiplicationInterface scratch = new ScratchAlgorithm();
        MultiplicationInterface bigInt = new BigIntAlgorithm();

        long startTimeBigInt = System.nanoTime();
        String resultBigInt = bigInt.multiply(num1, num2);
        long endTimeBigInt = System.nanoTime();
        long durationBigInt = endTimeBigInt - startTimeBigInt;
        System.out.println("files.BigIntAlgorithm took: " + durationBigInt + " nanoseconds");

        long startTimeScratch = System.nanoTime();
        String resultScratch = scratch.multiply(num1, num2);
        long endTimeScratch = System.nanoTime();
        long durationScratch = endTimeScratch - startTimeScratch;
        System.out.println("files.ScratchAlgorithm took: " + durationScratch + " nanoseconds");

    }
}
