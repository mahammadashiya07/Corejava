interface Vehicle {
    void start();
}

interface ElectricVehicle extends Vehicle {
    void charge();
}

interface PetrolVehicle extends Vehicle {
    void fillPetrol();
}

class Car implements ElectricVehicle, PetrolVehicle {

    public void start() {
        System.out.println("Car starts");
    }

    public void charge() {
        System.out.println("Electric car is charging");
    }

    public void fillPetrol() {
        System.out.println("Petrol is filled in the car");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.charge();
        c.fillPetrol();
    }
}
