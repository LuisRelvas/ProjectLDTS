package example.State;

import example.Viewer.Viewer;
import example.Viewer.Game.GameViewer;
import example.controller.Controller;
import example.controller.game.MapController;
import example.model.game.map.Map;

public class GameState extends State<Map> {
    public GameState(Map map) {
        super(map);
    }

    @Override
    protected Viewer<Map> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Map> getController() {
        return new MapController(getModel());
    }
}
