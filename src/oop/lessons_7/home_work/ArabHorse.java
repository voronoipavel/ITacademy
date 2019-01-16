package oop.lessons_7.home_work;

public class ArabHorse extends Horse {
    private String feature;

    @Override
    public String toString() {
        return "Имя лошади - " + getName()+
                ", возраст лошади - " + getAge() +
                ", особенности лошади - " + getFeature();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String bodyType) {
        this.feature = bodyType;
    }
    @Override
    public void sport(){
        System.out.println("Красивый шаг, Рысь, Голоп, Выносливость");
    }
}
