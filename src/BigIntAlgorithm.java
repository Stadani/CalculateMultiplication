import java.math.BigInteger;

public class BigIntAlgorithm {
    BigInteger num1;
    BigInteger num2;

    public BigIntAlgorithm(BigInteger num1, BigInteger num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public BigInteger multiply() {
        return num1.multiply(num2);
    }
}
