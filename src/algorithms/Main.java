package algorithms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Input two numbers that you want to multiply and choose algorithm(e.g. 954 638 1):");
            System.out.println("1. BigInteger Algorithm");
            System.out.println("2. From scratch Algorithm");

            String s = input.nextLine();
            String[] str = s.split(" ");

            if (str.length != 3) {
                System.out.println("Invalid input. Please enter exactly three parts separated by spaces.");
                continue;
            }

            boolean invalidInput = false;
            for (String numStr : str) {
                if (!numStr.matches("\\d+")) {
                    System.out.println("Invalid input. Each part should be a number.");
                    invalidInput = true;
                    break;
                }
            }

            if (!invalidInput) {
                validInput = true;
                switch (str[2]) {
                    case "1":
                        BigIntAlgorithm bigIntAlgorithm = new BigIntAlgorithm();
                        System.out.println(bigIntAlgorithm.multiply(str[0], str[1]));
                        break;
                    case "2":
                        ScratchAlgorithm scratchAlgorithm = new ScratchAlgorithm();
                        System.out.println(scratchAlgorithm.multiply(str[0], str[1]));
                        break;
                    default:
                        System.out.println("Invalid algorithm choice. Please enter 1 or 2.");
                        validInput = false;
                        break;
                }
            }
        }
        input.close();
    }
}
