package oop.lessons_24.classWork1;

public abstract class AbstractHome implements Livable {
    String address;
    int numOfFamilyMembers;
    double payAmount;
    public AbstractHome(int numOfFamilyMembers, String address){
        this.address = address;
        this.numOfFamilyMembers = numOfFamilyMembers;
    }

}