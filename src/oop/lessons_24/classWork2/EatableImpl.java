package oop.lessons_24.classWork2;

public class EatableImpl implements Eatable {
    String food;
    public EatableImpl(String food){
        this.food = food;
    }

    @Override
    public void eat(String food) throws Exception {
        if (food.equals("Мёд")){
            throw new Exception();
        }
        else {
            System.out.println(this.food);
        }
    }
}