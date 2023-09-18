package example.controller.game;

import example.controller.Controller;
import example.model.game.map.Map;

public abstract class GameController extends Controller<Map> {
    public GameController(Map map) {
        super(map);
    }
}
