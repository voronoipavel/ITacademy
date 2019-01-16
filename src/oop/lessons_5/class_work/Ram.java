package oop.lessons_5.class_work;

public class Ram {
    private int size;
    private String model;

    public Ram(int size, String model){
        this.size = size;
        this.model = model;
        System.out.print(" Obem ram = " + getSize() + " Model = " + getModel());
    }

    @Override
    public String toString(){
        return size + " " + model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
