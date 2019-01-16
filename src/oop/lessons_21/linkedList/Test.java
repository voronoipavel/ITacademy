package oop.lessons_21.linkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Pet> pets = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            pets.add(new Cat("Кошка" + String.valueOf(i + 1), i + 1));
            pets.add(new Dog("Собака" + String.valueOf(i + 1), i + 1));
        }

        int catPosition = 0;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat){
                ++catPosition;
                if(catPosition > 0 && catPosition%5 == 0){
                    pets.remove(i);
                    i--;
                }
            }
        }
        int dogPosition = 0;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Dog){
                ++dogPosition;
                if(dogPosition > 0 && dogPosition%3 == 0){
                    pets.add(i+1, new Mouse("Мышка" + String.valueOf(i + 1), i + 1));
                }
            }
        }

        boolean mouseFound = false;
        boolean catFound = false;
        LinkedList<Pet> mouseCatList = new LinkedList<>();

        for (int i = 0; i < pets.size(); i++) {
            if(pets.get(i) instanceof Mouse){
                mouseFound = true;
            }else if(pets.get(i) instanceof Dog) {
                mouseFound = false;
            }

            if(pets.get(i) instanceof Cat){
                catFound = true;
            }else if(pets.get(i) instanceof Dog) {
                catFound = false;
            }

            if (mouseFound && catFound){
                mouseCatList.add(pets.get(i-1));
                mouseCatList.add(pets.get(i));
                catFound = false;
                mouseFound = false;
            }

        }
        int ageDog = 0, ageCat = 0, ageMouse = 0;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat){
                ageCat += pets.get(i).getAge();
            }
            if (pets.get(i) instanceof Dog){
                ageDog += pets.get(i).getAge();
            }
            if (pets.get(i) instanceof Mouse) {
                ageMouse += pets.get(i).getAge();
            }
        }
        System.out.println("сумма возрастов кошек " + ageCat);
        System.out.println("сумма возрастов собак " + ageDog);
        System.out.println("сумма возрастов мышек " + ageMouse);

        for (Pet p: pets ) {
            System.out.println(p);
        }
        //pets.pollLast();
        System.out.println(" ============ ");
        for (Pet p: mouseCatList ) {
            System.out.println(p);
        }

    }
}