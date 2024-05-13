public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModelName("Car 1");
        car.setWheelsCount(4);

        Truck truck = new Truck();
        truck.setModelName("Truck 1");
        truck.setWheelsCount(6);

        Bicycle bicycle = new Bicycle();
        bicycle.setModelName("Bicycle 1");
        bicycle.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(truck);
        station.check(bicycle);
    }
}