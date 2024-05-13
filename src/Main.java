public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes-Benz", 4);
        Truck truck = new Truck("ЗИЛ-130", 6);
        Bicycle bicycle = new Bicycle("Stels Navigator", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(truck);
        station.check(bicycle);
    }
}
