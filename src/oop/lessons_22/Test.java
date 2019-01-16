package oop.lessons_22;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<LapCom> lapComs = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i < 50) {
                lapComs.add(new Laptop(450, LapComModel.DELL));
            } else {
                lapComs.add(new Computer(600, LapComModel.ACER, 18));
            }
        }
        int sum = 0;
        int sumSale = 0;
        for (int i = 0; i < lapComs.size(); i++) {
            sum += lapComs.get(i).getPrice();
        }
        for (int i = 0; i < lapComs.size(); i++) {
            if (lapComs.get(i) instanceof Laptop){
            sumSale += lapComs.get(i).sale();
        }}
        LapCom lapCom = new Computer(500, LapComModel.ACER, 21);
        System.out.println(lapCom);

        System.out.println(sum);
        System.out.println(sumSale);

    }
}
