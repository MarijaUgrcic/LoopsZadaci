import java.util.Scanner;

public class Digitron {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite operaciju: ");
        String operator = scanner.next();

        System.out.println("Unesite prvi broj: ");
        double operand1 = scanner.nextInt();

        System.out.println("Unesite drugi broj: ");
        double operand2 = scanner.nextInt();
        while (operand2 == 0 && operator.equals("/")) {
            System.out.println("Unesite drugi broj: ");
            operand2 = scanner.nextInt();
        }


        if (operator.equals("+")) {
            System.out.println("Zbir je: " + (operand1 + operand2));
        } else if (operator.equals("-")) {
            System.out.println("Razlika je: " + (operand1 - operand2));
        } else if (operator.equals("*")) {
            System.out.println("Proizvod je: " + (operand1 * operand2));
        } else if (operator.equals("/")) {
            System.out.println("Deljenje je: " + (operand1 / operand2));
        } else {
            System.out.println("Greska pri unosu");
        }


    }
}