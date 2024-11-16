package logic;

import java.util.ArrayList;
import java.util.List;
import logic.Distance;

import models.GameState;
import models.PlayerAction;

public class Strategy{
    
    public static List<PlayerAction> decide(GameState gameState){
        gameState.getBases();
        Distance distance = new Distance();
        distance.calculateDistance(null, null); // Berechnet die Distanz zu einer Base.
        List<PlayerAction> playerAction = new ArrayList<>();
        playerAction.add(new PlayerAction(0, 0, 0));
        return playerAction;
    }
}
