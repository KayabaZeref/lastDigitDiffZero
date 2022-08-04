import java.util.Scanner;

class Factoral {
    public static void main(String[] args) {
        int totalFac = 1;
        int lastDigit = 0;
        int i;
        int resultDivided;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input Factoral Number: ");
            int inputNumber = sc.nextInt();

            for (i = 1; i <= inputNumber; i++) {
                totalFac *= i;
            }
        }
        resultDivided = totalFac;
        while (lastDigit == 0) {
            resultDivided /= 10;
            lastDigit = resultDivided % 10;
        }
        System.out.println("Last Digit number is: " + lastDigit);
    }

}
