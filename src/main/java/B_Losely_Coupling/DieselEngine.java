package B_Losely_Coupling;

import A_Tidely_Coupling.Engine;

public class DieselEngine implements IEngine {
    @Override
    public int start() {
        System.out.println("Diesel Engine start");
        return 1;
    }
}
