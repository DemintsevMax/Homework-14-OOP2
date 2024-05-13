public class Car extends Vehicle {
    @Override
    public void checkEngine() {
        super.checkEngine();
        System.out.println("Дополнительная проверка для автомобиля");
    }
    public void updateTyre() {
        System.out.println("Меняем все покрышки");
}}