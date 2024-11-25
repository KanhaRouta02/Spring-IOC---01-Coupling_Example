package A_Tidely_Coupling;

//for IS-A-Relationship
/*
public class Car extends Engine {
    public void drive(){
        int status = super.start();
        if (status == 0){
            System.out.println("Car start...");
        }else {
            System.out.println("Engine have problem...");
        }
    }
}
*/

// or

// for HAS-A-Relationship
public class Car  {
    public void drive(){
        Engine engine = new Engine("Petrol");
//      Engine engine = new Engine();
        int status = engine.start();
        if (status == 0){
            System.out.println("Car start...");
        }else {
            System.out.println("Engine have problem...");
        }
    }
}
