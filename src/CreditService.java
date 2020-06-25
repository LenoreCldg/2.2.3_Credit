public class CreditService {
    public double calculate (int LoanCredit, int Months, double AnnualRate) {

        double MonthlyRate = AnnualRate/12/100;
        double CoefficientOfAnnuitant = MonthlyRate * Math.pow((MonthlyRate + 1), Months) / (Math.pow((MonthlyRate + 1), Months) - 1);
        int payment = (int) (CoefficientOfAnnuitant * LoanCredit);

        return payment;

    }
}
