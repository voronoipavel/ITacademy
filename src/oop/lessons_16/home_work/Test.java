package oop.lessons_16.home_work;

public class Test {
    public static void main(String[] args) {
        Animals animals1 = new Panda();
        Animals animals2 = new Monkey();

        animals1.setName("Кунг-фу панда");
        animals2.setName("Обезьяна чичичи");
        System.out.println(animals1);
        System.out.println(animals2);
        animals1.canKeepOnYourBack(animals2);
        animals1.climb();
        animals2.canKeepOnYourBack(animals1);
        animals2.climb();
        animals2.canKeepOnYourBack(animals2);
    }
}
