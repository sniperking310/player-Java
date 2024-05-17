package models;

import java.util.UUID;

public class BoardAction{

    int src = 0;
    int dest = 0;
    int amount = 0;
    UUID uuid = new UUID(0, 0);
    int player = 0;
    Progress progress = new Progress(0, 0);

    public BoardAction(int src, int dest, int amount, UUID uuid, int player, Progress progress){
        this.src = src;
        this.dest = dest;
        this.amount = amount;
        this.uuid = uuid;
        this.player = player;
        this.progress = progress;
    }
}
