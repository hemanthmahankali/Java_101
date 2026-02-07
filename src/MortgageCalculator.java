public class MortgageCalculator {
    private int principle;
    private float annualInterestRate;
    private int period;

    public MortgageCalculator(int principle, float annualInterestRate, int period) {
        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.period = period;
    }

    public float calculateMortgage() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = period * MONTHS_IN_YEAR;

        return (float) (principle * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
    }
}