package con.nt.maintest;

import con.nt.compnents.Bike;
import con.nt.factory.BikeFactory;

public class FactoryPatterTest {
    public static void main(String[] args) {
        Bike bike = BikeFactory.orderbike("sports");
        bike.drive();
        Bike bike1 = BikeFactory.orderbike("BULLET");
        bike1.drive();
        Bike bike2 = BikeFactory.orderbike("electric");
        bike2.drive();



    }
}
