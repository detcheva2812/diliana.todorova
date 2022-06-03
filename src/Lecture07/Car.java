package Lecture07;

public class Car {

    String name;
    String color;
    int releaseYear;
    int horsePower;
    boolean isSecondHand;

    Car car1 = new Car();
    Car car2 = new Car(name, color,releaseYear, horsePower, isSecondHand);
    Car car3 = new Car(name, color, isSecondHand);
    Car car4 = new Car(name, color, releaseYear, horsePower);


    public Car(String color, int releaseYear, int horsePower, boolean isSecondHand) {
        this("N/A", "N/A", -1, -1, false);
    }

    public Car() {
    }

    public Car(String name, String color, int releaseYear, int horsePower, boolean isSecondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.isSecondHand = isSecondHand;
    }

    public Car(String name, String color, boolean isSecondHand) {
        this.name = name;
        this.color = color;
        this.isSecondHand = isSecondHand;
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
    }

}

