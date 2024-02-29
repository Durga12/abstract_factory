package demo.component.caruifactory;

import demo.component.car.ElectricVechicle;
import demo.component.car.PetrolVehicle;
import demo.component.car.nexon.NexonEV;
import demo.component.car.nexon.NexonPetrol;

public class NexonCarFactory implements CarFactory{
    @Override
    public ElectricVechicle createEV() {
        return new NexonEV();
    }

    @Override
    public PetrolVehicle createPV() {
        return new NexonPetrol();
    }
}
