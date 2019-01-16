package oop.lessons_17.animals;

public class Weight implements Weightable{
    @Override
    public String weight(int weight) {
        int n = 10;
        if (n > weight){
            return "Тяжелее";
        }
        return "Легче";
    }
}
