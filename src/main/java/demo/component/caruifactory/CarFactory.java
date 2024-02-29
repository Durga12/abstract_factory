package demo.component.caruifactory;

import demo.component.car.ElectricVechicle;
import demo.component.car.PetrolVehicle;

public interface CarFactory {
    ElectricVechicle createEV();
    PetrolVehicle createPV();
}
