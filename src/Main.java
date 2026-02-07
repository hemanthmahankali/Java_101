import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principle:");
        int principle = scanner.nextInt();

        System.out.println("Annual Interest Rate:");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Period (Years):");
        int period = scanner.nextInt();

        MortgageCalculator calculator = new MortgageCalculator(principle, annualInterestRate, period);
        float mortgage = calculator.calculateMortgage();

        System.out.println("Mortgage: " + mortgage);
    }
}