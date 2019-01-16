package oop.lessons_7.class_work;

public class Test {
    public static void main(String[] args) {


        Bread bread1 = new Bread();
        Bread bread2 = new Bread();
        bread1.setPrice(15);
        bread1.setWeught(600);
        bread1.setProducerCompany("Хлеб");

        Lepeshka lepeshka1 = new  Lepeshka();
        lepeshka1.setPrice(20);
        lepeshka1.setRadius(25);
        lepeshka1.setWeught(450);
        lepeshka1.setProducerCompany("Лепешка");

        Lavash lavash1 = new Lavash();
        lavash1.setPrice(100);
        lavash1.setWeught(200);
        lavash1.setProducerCompany("Лаваш");

        bread1.bake();
        lavash1.bake();
        lepeshka1.bake();
        lavash1.bake();
        bread2.bake();

        System.out.println(bread2);
        System.out.println(bread1);
        System.out.println(lepeshka1);
        System.out.println(lavash1);
    }
}
