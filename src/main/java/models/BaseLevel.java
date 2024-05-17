package models;

public class BaseLevel {

    int maxPopulation = 0;
    int upgradeCost = 0;
    int spawnRate = 0;

    public BaseLevel(int maxPopulation, int upgradeCost, int spawnRate){
        this.maxPopulation = maxPopulation;
        this.upgradeCost = upgradeCost;
        this.spawnRate = spawnRate;
    }
}
