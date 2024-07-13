package tests;

import algorithms.BigIntAlgorithm;
import algorithms.MultiplicationInterface;
import algorithms.ScratchAlgorithm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        String num1 = "12345678901234567890";
        String num2 = "11111111111111111111";

        MultiplicationInterface bigInt = new BigIntAlgorithm();
        MultiplicationInterface scratch = new ScratchAlgorithm();

        String res1 = bigInt.multiply(num1, num2);
        String res2 = scratch.multiply(num1, num2);

        assertEquals(res1, res2);
    }

}
