package oop.lessons_1;

public class Void {
    public static void main(String[] args) {
        double value = 1000;
        System.out.println(value * getCurrentCurrencyRate("USD", true));
    }
    static double getCurrentCurrencyRate(String getCurr, boolean isBuy) {
        double something;
        double sell[] = {69.5, 79.5, 1.05, 0.3};
        double buy[] = {69.0, 79.0, 1.00, 0.29};
        if (isBuy) {
            switch (getCurr) {
                case "USD":
                    something = sell[0];
                    break;
                case "EUR":
                    something = sell[1];
                    break;
                case "RUB":
                    something = sell[2];
                    break;
                case "KZT":
                    something = sell[3];
                    break;
                default:
                    something = 1;
            }
        } else {
            switch (getCurr) {
                case "USD":
                    something = buy[0];
                    break;
                case "EUR":
                    something = buy[1];
                    break;
                case "RUB":
                    something = buy[2];
                    break;
                case "KZT":
                    something = buy[3];
                    break;
                default:
                    something = 1;
            }
        }
        return something;
    }
}
