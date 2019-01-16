package oop.lessons_1;

public class SaleOfApartments {
    public static void main(String[] args) {

        System.out.println(Pricing(45.2, 1));
        System.out.println(Pricing(68.5,2));
        System.out.println(Pricing(88.2,3));
        System.out.println(Pricing(101.9,4));
    }

    static double Pricing(double flatArea, int floor) {
        double apartmentPrice;
        int pricePerSquare = 700;
        pricePerSquare = pricePerSquare * floor / 100 + pricePerSquare;
        apartmentPrice = flatArea * pricePerSquare;
        return apartmentPrice;
    }
}
