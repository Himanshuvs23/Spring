package con.nt.factory;

import con.nt.compnents.Bike;
import con.nt.compnents.BulletBike;
import con.nt.compnents.ElectricBike;
import con.nt.compnents.SportBike;

public class BikeFactory {
    //Factory method
    public static Bike orderbike(String type){
        Bike bike = null;
        if(type.equalsIgnoreCase("sports") )
            bike =new SportBike();
        else if (type.equalsIgnoreCase("bullet"))
            bike = new BulletBike();
        else if (type.equalsIgnoreCase("electric"))
            bike = new ElectricBike();
        else
            throw new IllegalArgumentException("Invalid bike type");

        return bike;

    }
}
