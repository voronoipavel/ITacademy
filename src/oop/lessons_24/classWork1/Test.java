package oop.lessons_24.classWork1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Livable> rooms = new ArrayList<>();
        rooms.add(new Hotel(5, "Chuy 45"));
        rooms.add(new Hotel(3, "Chuy 4"));
        rooms.add(new Hotel(4, "Chuy 5"));
        rooms.add(new Flat(4, "Chuy 5"));
        rooms.add(new Flat(4, "Chuy 5"));
        rooms.add(new SharedRoom(4, "Chuy 5"));


        int[] personsLive = new int[3];
        int[] sumPayAmount = new int[3];

        for (Livable ah : rooms) {
            if (ah instanceof Flat) {
                personsLive[0] += ((Flat) ah).numOfFamilyMembers;
                sumPayAmount[0] += ah.pay(1000);
            } else if (ah instanceof Hotel) {
                personsLive[1] += ((Hotel) ah).numOfFamilyMembers;
                sumPayAmount[1] += ah.pay(5000);
            } else if (ah instanceof SharedRoom){
                personsLive[2] += ((SharedRoom) ah).numOfFamilyMembers;
                sumPayAmount[2] += ah.pay(500);
            }
        }
        for (int i: personsLive) {
            System.out.println(i);

        }
        for (int i: sumPayAmount) {
            System.out.println(i);

        }
    }
}
