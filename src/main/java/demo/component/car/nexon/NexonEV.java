package demo.component.car.nexon;

import demo.component.car.ElectricVechicle;

public class NexonEV implements ElectricVechicle {
    @Override
    public void make() {
        System.out.println("Make the Nexon EV");
    }
}
