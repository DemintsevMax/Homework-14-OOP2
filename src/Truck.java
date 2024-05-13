class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика " + modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика " + modelName);
    }

    @Override
    public void performService() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}