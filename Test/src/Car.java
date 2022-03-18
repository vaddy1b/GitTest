public class Car implements CarActions{

    protected static int GAS = 10;

    @Override
    public void carGoes() {
        System.out.println("Машина едет");
    }

    @Override
    public void carStops() {
        System.out.println("Машина остановилась");
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатель запущен");
    }

    @Override
    public boolean fuelEnough() {
        return false;
    }
}
