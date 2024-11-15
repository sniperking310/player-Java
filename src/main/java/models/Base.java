package models;

public class Base{

    Position position = new Position(0, 0, 0);
    int uid = 0;
    int player = 0;
    int population = 0;
    int level = 0;
    int unitsUntilUpgrade = 0;
    
    public Base(Position position, int uid, int player, int population, int level, int unitsUntilUpgrade){
        this.position = position;
        this.uid = uid;
        this.player = player;
        this.population = population;
        this.level = level;
        this.unitsUntilUpgrade = unitsUntilUpgrade;
    }

    public Position getPosition() {
        return position;
    }

    public int getUid() {
        return uid;
    }
}
