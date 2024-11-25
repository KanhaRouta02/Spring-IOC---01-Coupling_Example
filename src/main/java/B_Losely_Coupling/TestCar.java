package B_Losely_Coupling;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.drive();
    }
}
