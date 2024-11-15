package logic;
import java.lang.Math.*;
import models.Base;


public class Distance {
    private int distance = 0 ;

    public int calculateDistance(Base base , Base banana){
        int id, x, y, z, id_, x_, y_, z_;
        id = base.getUid() ;
        x = base.getPosition().getX();
        y = base.getPosition().getY();
        z = base.getPosition().getZ();

        x_ = banana.getPosition().getX();
        y_ = banana.getPosition().getY();
        z_ = banana.getPosition().getZ();

        // Finish Here

        return distance;
    }
}
