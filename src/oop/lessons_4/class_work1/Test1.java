package oop.lessons_4.class_work1;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
            Random rnd = new Random();
            int n = 100;
            Circle circle1[] = new Circle[n];
            Circle circle2[] = new Circle[n];
            int indexCircle2 = 0;

        System.out.println(rnd.nextInt(100));
            for(int i = 0; i < circle1.length; i++){
                circle1[i] = new Circle(5);
                if(circle1[i].getRadius() % 3 == 0){
                    circle2[indexCircle2] = new Circle(circle1[i].getRadius());
                    indexCircle2++;
                }
            }
            System.out.println("Кол-во кругов, радиус которых равен 3: "+ indexCircle2);
        }
    }