package models;

public class Progress{

    int distance = 0;
    int traveled = 0;

    public Progress(int distance, int traveled){
        this.distance = distance;
        this.traveled = traveled;
    }

    public int getdDistanceLeft(){
        return distance - traveled;
    }
}
