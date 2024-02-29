package demo.component.caruifactory;

import demo.component.car.ElectricVechicle;
import demo.component.car.PetrolVehicle;
import demo.component.car.tata.TataEV;
import demo.component.car.tata.TataPetrol;

public class TataCarFactory implements CarFactory{
    @Override
    public ElectricVechicle createEV() {
        return new TataEV();
    }

    @Override
    public PetrolVehicle createPV() {
        return new TataPetrol();
    }
}
