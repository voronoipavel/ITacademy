package oop.lessons_17.canvertable;

public class Exchenses implements Convertable{

    @Override
    public double convert(String carrensy, int amount){
        if (carrensy.equalsIgnoreCase("USA")){
            return amount * 69.7;
        }
        if (carrensy.equalsIgnoreCase("EUR")){
            return amount * 82.5;
        }
        return amount;
    }
}
