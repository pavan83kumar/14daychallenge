package assignment1;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setMake("Honda");
        newCar.setModel("Accord");
        newCar.setYear(2023);

        System.out.println(newCar.toString());
    }
}
