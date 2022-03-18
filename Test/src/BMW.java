public class BMW extends Car {
    @Override
    public void carGoes() {
        super.carGoes();
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
        return super.fuelEnough();
    }
}
