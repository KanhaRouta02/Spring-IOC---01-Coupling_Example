package B_Losely_Coupling;

public class PetrolEngine implements IEngine{
    @Override
    public int start() {
        System.out.println("Petrol Engine start");
        return 1;
    }
}
