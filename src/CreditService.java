public class CreditService {
    public double calculate(int loanCredit, int months, double annualRate) {

        double monthlyRate = annualRate / 12 / 100;
        double coefficientOfAnnuitant = monthlyRate * Math.pow((monthlyRate + 1), months) / (Math.pow((monthlyRate + 1), months) - 1);
        int payment = (int) (coefficientOfAnnuitant * loanCredit);

        return payment;

    }
}
