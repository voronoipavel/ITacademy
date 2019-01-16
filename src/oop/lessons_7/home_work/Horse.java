package oop.lessons_7.home_work;

public class Horse {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Имя лошади - " + getName()+
                ", возраст лошади - " + getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sport(){
        System.out.println("Шаг, Рысь, Голоп");
    }
}
