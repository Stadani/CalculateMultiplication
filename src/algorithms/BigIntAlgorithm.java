package algorithms;

import java.math.BigInteger;

public class BigIntAlgorithm implements MultiplicationInterface {
    BigInteger num1;
    BigInteger num2;

    @Override
    public String multiply(String num1, String num2) {
        this.num1 = new BigInteger(num1);
        this.num2 = new BigInteger(num2);
        return this.num1.multiply(this.num2).toString();
    }
}
