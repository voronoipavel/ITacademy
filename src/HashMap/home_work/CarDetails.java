package HashMap.home_work;

public class CarDetails {
    String color;
    String fio;
    String year_of;

    public CarDetails(String color, String fio, String year_of) {
        this.color = color;
        this.fio = fio;
        this.year_of = year_of;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "color='" + color + '\'' +
                ", fio='" + fio + '\'' +
                ", year_of='" + year_of + '\'' +
                '}';
    }
}