package algorithms;

public class ScratchAlgorithm implements MultiplicationInterface {

    @Override
    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int[] result = new int[length1 + length2];

        for (int i = length1 - 1; i >= 0; i--) {
            for (int j = length2 - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int multi = digit1 * digit2;
                int sum = multi + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (!(sb.isEmpty() && r == 0)) {
                sb.append(r);
            }
        }

        return sb.isEmpty() ? "0" : sb.toString();
    }
}
