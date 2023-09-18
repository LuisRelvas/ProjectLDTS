package example.State.MenuState;

import example.State.State;
import example.Viewer.MenuViewer.GameOverViewer;
import example.Viewer.Viewer;
import example.controller.Controller;
import example.controller.menu.GameOverMenuController;
import example.model.menu.GameOverMenu;

public class GameOverState extends State<GameOverMenu> {

    public GameOverState(GameOverMenu gameOverMenu) {
        super(gameOverMenu);
    }

    @Override
    protected Viewer<GameOverMenu> getViewer() {
        return new GameOverViewer(getModel());
    }

    @Override
    protected Controller<GameOverMenu> getController() {
        return new GameOverMenuController(getModel());
    }
}
