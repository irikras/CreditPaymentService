public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm, double InterestRate) {
        double monthlyInterestRate = InterestRate / 100 / 12;
        double interim = monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, loanTerm) - 1);
        double monthlyPayment = loanAmount * (monthlyInterestRate + interim);

        double result = Math.round(monthlyPayment);
        return result;
    }
}
