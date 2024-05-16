package models;

public class PathConfig{

    int gracePeriod = 0; 
    int deathRate = 0;

    public PathConfig(int gracePeriod, int deathRate){
        this.gracePeriod = gracePeriod;
        this.deathRate = deathRate;
    }
}
