package oop.lessons_24.classWork1;

public class SharedRoom extends AbstractHome {
    public SharedRoom (int numOfFamilyMembers, String address) {
        super(numOfFamilyMembers, address);
    }

    @Override
    public double pay(double payAmount) {
        return payAmount * super.numOfFamilyMembers;
    }
    @Override
    public String live(){
        return super.address;
    }
}
