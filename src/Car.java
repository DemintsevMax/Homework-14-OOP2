class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля " + modelName);
    }

    @Override
    public void performService() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
    }
}