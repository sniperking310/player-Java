package logic;

import java.util.ArrayList;
import java.util.List;

import models.GameState;
import models.PlayerAction;

public class Strategy{
    
    public static List<PlayerAction> decide(GameState gameState){
        
        List<PlayerAction> playerAction = new ArrayList<>();
        System.out.println(gameState);
        playerAction.add(new PlayerAction(0, 0, 0));
        return playerAction;
    }
}
