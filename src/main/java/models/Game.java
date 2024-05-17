package models;

public class Game{

    int uid = 0;
    int tick = 0; 
    int playerCount = 0; 
    int remainingPlayers = 0; 
    int player = 0;

    public Game(int uid, int tick, int playerCount, int remainingPlayers, int player){
        this.uid = uid;
        this.tick = tick;
        this.playerCount = playerCount;
        this.remainingPlayers = remainingPlayers;
        this.player = player;
    }
}
