package oop.Lessons_10.home_work;

public class Credit {
    private static int id;
    private double creditAmount; // сумма кредита
    private double interestRate; //процентная ставка
    private double loanTermInMonths; //срок кредита в месяцах

    public Credit(double creditAmount, double interestRate, double loanTermInMonths) {
        this.creditAmount = creditAmount;
        this.interestRate = interestRate;
        this.loanTermInMonths = loanTermInMonths;
    }

    public void calculationOfTheMonthlyPayment() {

        double coefficient = interestRate / 100 / 12;
        double q = creditAmount / loanTermInMonths;
        double monthlyPaymentRatio = (coefficient * Math.pow((1 + coefficient), loanTermInMonths)) / (Math.pow((1 + coefficient), loanTermInMonths) - 1);
        double monthlyPayment = monthlyPaymentRatio * creditAmount;
        double f = creditAmount * coefficient;
        double totalPercentage = 0;

        for (int j = 1; j <= loanTermInMonths; j++) {

            System.out.printf("Месяц: %d Остаток задолженности по кредиту: %.2f Выплата процентов: %.2f Начисленный процент: %.2f Итоговый платеж %.2f Платежи по кредиту %.2f\n",
                    j, creditAmount, f, q, f + q, monthlyPayment);

            creditAmount = creditAmount - q;
            f = creditAmount * coefficient;
            totalPercentage = totalPercentage + monthlyPayment;
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("ОБЩАЯ СУММА ВЫПЛАТ: %.2f", totalPercentage);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Credit.id = id;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLoanTermInMonths() {
        return loanTermInMonths;
    }

    public void setLoanTermInMonths(double loanTermInMonths) {
        this.loanTermInMonths = loanTermInMonths;
    }
}
