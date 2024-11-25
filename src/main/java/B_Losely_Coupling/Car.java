package B_Losely_Coupling;

public class Car {
    private IEngine engine ;
    public Car(IEngine engine) {
        this.engine = engine;
    }
    public void drive() {
        int status = engine.start();
        if (status == 1) {
            System.out.println("Driving Car");
        }else{
            System.out.println("Driving Car Fail");
        }
    }
}
