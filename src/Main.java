import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input two numbers that you want to multiply and choose algorithm(e.g. 954 638 1):");
        System.out.println("1. BigInteger Algorithm");
        System.out.println("2. From scratch Algorithm");

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] str = s.split(" ");
        input.close();

        switch (str[2]) {
            case "1":
                BigIntAlgorithm bigIntAlgorithm = new BigIntAlgorithm();
                System.out.println(bigIntAlgorithm.multiply(str[0], str[1]));
                break;
            case "2":
                ScratchAlgorithm scratchAlgorithm = new ScratchAlgorithm();
                System.out.println(scratchAlgorithm.multiply(str[0], str[1]));
                break;
        }


    }
}