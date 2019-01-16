package oop.lessons_7.home_work;

public class Test {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.setName("Лошадь 1");
        horse1.setAge(5);
        System.out.println(horse1);
        horse1.sport();
        System.out.println("-----------------------------");

        ArabHorse arabHorse1 = new ArabHorse();
        arabHorse1.setName("Арабская лошадь 1");
        arabHorse1.setAge(7);
        arabHorse1.setFeature("Красивое телосложение");
        System.out.println(arabHorse1);
        arabHorse1.sport();
        System.out.println("-----------------------------");

        ThorianHorse thorianHorse1 = new ThorianHorse();
        thorianHorse1.setName("Торийская лошадь 1");
        thorianHorse1.setAge(8);
        thorianHorse1.setFeature("Тяжеловоз");
        thorianHorse1.setKg(500);
        System.out.println(thorianHorse1);
        thorianHorse1.sport();
        System.out.println("-----------------------------");
    }
}
