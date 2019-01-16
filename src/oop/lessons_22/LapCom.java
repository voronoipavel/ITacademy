package oop.lessons_22;

public class LapCom {
    int price;
    LapComModel model;

    public LapCom(int price, LapComModel model) {
        this.price = price;
        this.model = model;
    }

    public  void  poisk(int price, String model){

    }

    public int getPrice() {
        return price;
    }

    public int sale(){

        return this.price - (int)(this.price*0.2);
    }
}
