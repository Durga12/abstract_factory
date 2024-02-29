package demo.component.car;

import demo.component.caruifactory.CarFactory;

public class CarApplication {
    private ElectricVechicle electricVechicle;
    private PetrolVehicle petrolVehicle;
    public CarApplication(CarFactory factory){
        electricVechicle = factory.createEV();
        petrolVehicle = factory.createPV();
    }

    public void make(){
        electricVechicle.make();
        petrolVehicle.make();
    }
}
