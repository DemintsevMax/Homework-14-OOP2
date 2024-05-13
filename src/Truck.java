public class Truck extends Vehicle {
    @Override
    public void checkEngine() {
        super.checkEngine();
        System.out.println("Дополнительная проверка для грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}