package models;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    List<BoardAction> actions = new ArrayList<>();
    List<Base> bases = new ArrayList<>();
    GameConfig config = new GameConfig(new ArrayList<BaseLevel>(), new PathConfig(0, 0));
    Game game = new Game(0, 0, 0, 0, 0);

    public GameState(List<BoardAction> actions, List<Base> bases, GameConfig config, Game game){
        this.actions = actions;
        this.bases = bases;
        this.config = config;
        this.game = game;
    }
}
