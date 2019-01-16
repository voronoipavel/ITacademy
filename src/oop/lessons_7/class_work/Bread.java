package oop.lessons_7.class_work;

public class Bread {
    double weught;
    double price;
    String producerCompany;
    String name;

    @Override
    public String toString() {
        return "вес = " + weught +
                ", цена = " + price +
                ", название = " + producerCompany +
                ", бренд = " + name;
    }

    public double getWeught() {
        return weught;
    }

    public void setWeught(double weught) {
        this.weught = weught;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }

    void bake(){
        if (weught == 0 || price == 0) {
            System.out.println("Мы не раздаем хлеб");
        }
        System.out.println("Хлеб готов!");
    }
    void pack(){
        System.out.println("Упакован");
    }
}
