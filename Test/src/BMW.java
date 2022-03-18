public class BMW extends Car {
    @Override
    public void carGoes() {
        super.carGoes();
        GAS--;
        System.out.println(" " + getClass());
    }

    @Override
    public void carStops() {
        super.carStops();
        System.out.println(" " + getClass());
    }

    @Override
    public void engineStart() {
        super.engineStart();
    }

    @Override
    public boolean fuelEnough() {
        if (GAS>5)
            return true;
        return super.fuelEnough();
    }
}
