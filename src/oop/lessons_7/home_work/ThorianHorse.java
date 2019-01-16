package oop.lessons_7.home_work;

public class ThorianHorse extends Horse{
    private String feature;
    private int kg;

    @Override
    public String toString() {
        return "Имя лошади - " + getName()+
                ", возраст лошади - " + getAge() +
                ", особенности лошади - " + getFeature() +
                ", грузоподъемность в кг - " + getKg();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
    @Override
    public void sport(){
        System.out.println("Этот вид лошадей не умеет бегать");
    }
}
