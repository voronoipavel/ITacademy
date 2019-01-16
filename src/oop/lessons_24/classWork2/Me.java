package oop.lessons_24.classWork2;

public class Me implements Waikable {
    Eatable eatable;

    @Override
    public void walk(String place) throws Exception {
        if (place == null){
            throw new Exception();
        }else System.out.println();

    }
}
